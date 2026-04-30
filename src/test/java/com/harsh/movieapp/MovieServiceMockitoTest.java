package com.harsh.movieapp;

import com.harsh.movieapp.entity.Movie;
import com.harsh.movieapp.repository.MovieRepository;
import com.harsh.movieapp.service.MovieService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class MovieServiceMockitoTest {

    @Mock
    private MovieRepository repo;

    @InjectMocks
    private MovieService service;

    @Test
    void testSaveMovie() {
        Movie movie = new Movie();
        movie.setTitle("Test Movie");

        when(repo.save(movie)).thenReturn(movie);

        Movie saved = service.save(movie);

        assertEquals("Test Movie", saved.getTitle());
    }
}