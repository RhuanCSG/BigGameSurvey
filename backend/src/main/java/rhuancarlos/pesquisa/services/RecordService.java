package rhuancarlos.pesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rhuancarlos.pesquisa.dto.RecordDTO;
import rhuancarlos.pesquisa.dto.RecordInsertDTO;
import rhuancarlos.pesquisa.entities.Game;
import rhuancarlos.pesquisa.entities.Record;
import rhuancarlos.pesquisa.repositories.GameRepository;
import rhuancarlos.pesquisa.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		copyToDto(dto, entity);
		return new RecordDTO(entity);
	}
	
	
	public void copyToDto (RecordInsertDTO dto,  Record entity) {
		
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getReferenceById(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		
	}
}
