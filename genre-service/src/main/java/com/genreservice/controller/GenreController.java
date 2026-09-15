package com.genreservice.controller;


import com.genreservice.dto.response.GenreResponse;
import com.genreservice.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/genres")
@RequiredArgsConstructor
public class GenreController {
    private final GenreService genreService;

    @GetMapping("/{id}")
    public ResponseEntity<GenreResponse> getAccountByNumber(@PathVariable Long id) {
        return ResponseEntity.ok(genreService.getGenreById(id));
    }

}

