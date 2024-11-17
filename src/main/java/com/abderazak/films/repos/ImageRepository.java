package com.abderazak.films.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abderazak.films.entities.Image;

public interface ImageRepository extends JpaRepository<Image , Long> {

}
