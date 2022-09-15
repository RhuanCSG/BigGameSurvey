package rhuancarlos.pesquisa.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rhuancarlos.pesquisa.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre , Long> {

}
