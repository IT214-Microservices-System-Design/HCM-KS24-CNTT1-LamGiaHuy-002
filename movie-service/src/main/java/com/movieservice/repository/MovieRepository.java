package com.movieservice.repository;

import com.movieservice.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> getAllMovies();
    Movie getMovieById(Long id);
}
