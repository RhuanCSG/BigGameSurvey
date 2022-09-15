package rhuancarlos.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rhuancarlos.pesquisa.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
