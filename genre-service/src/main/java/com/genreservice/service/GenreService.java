package com.genreservice.service;

import com.genreservice.entity.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreService {
    List<Genre> getAllGenres();

    Genre getGenreById(Long id);
}
