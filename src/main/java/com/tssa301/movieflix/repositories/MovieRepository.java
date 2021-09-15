package com.tssa301.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tssa301.movieflix.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
