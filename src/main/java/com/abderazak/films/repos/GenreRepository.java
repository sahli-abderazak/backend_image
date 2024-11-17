package com.abderazak.films.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.abderazak.films.entities.Genre;

//@RepositoryRestResource(path = "rest")
@RepositoryRestResource(path = "genre")
@CrossOrigin("http://localhost:4200/") 
public interface GenreRepository extends JpaRepository<Genre, Long>{
	

}
