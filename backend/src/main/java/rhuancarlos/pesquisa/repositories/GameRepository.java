package rhuancarlos.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import rhuancarlos.pesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
