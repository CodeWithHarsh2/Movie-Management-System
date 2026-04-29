package com.harsh.movieapp;

import com.harsh.movieapp.entity.Movie;
import com.harsh.movieapp.service.MovieService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class MovieServiceTest {

    @Autowired
    private MovieService service;

    @Test
    void testSaveMovie() {
        Movie movie = new Movie();
        movie.setTitle("Test Movie");
        movie.setGenre("Test Genre");
        movie.setReleaseYear(2024);

        Movie saved = service.save(movie);

        assertNotNull(saved.getId());
    }
}