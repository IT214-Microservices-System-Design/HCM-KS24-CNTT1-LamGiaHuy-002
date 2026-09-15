package com.genreservice.service.impl;

import com.genreservice.repository.GenreRepository;
import com.genreservice.entity.Genre;
import com.genreservice.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenresServiceImpl implements GenreService {
    private final GenreRepository genreRepository;
    private GenreService genreService;

    @Override
    public List<Genre> getAllGenres() {
        return genreRepository.getAllGenres();
    }

    @Override
    public Genre getGenreById(Long id) {
        return genreRepository.getGenreById(id);
    }
}
