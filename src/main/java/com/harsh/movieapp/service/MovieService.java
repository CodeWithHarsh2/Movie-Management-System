package com.harsh.movieapp.service;

import com.harsh.movieapp.entity.Movie;
import com.harsh.movieapp.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repo;

    public Movie save(Movie movie) {
        return repo.save(movie);
    }

    public List<Movie> getAll() {
        return repo.findAll();
    }

    // 🔥 ADD THIS
    public Movie getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}