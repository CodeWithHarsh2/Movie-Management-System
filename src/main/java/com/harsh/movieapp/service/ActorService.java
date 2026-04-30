package com.harsh.movieapp.service;

import com.harsh.movieapp.entity.Actor;
import com.harsh.movieapp.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    @Autowired
    private ActorRepository repo;

    public Actor save(Actor actor) {
        return repo.save(actor);
    }

    public List<Object[]> getJoinData() {
        return repo.getActorMovieData();
    }

    public List<Actor> getAllActors() {
        return repo.findAll();
    }

    public Actor getActorById(Long id) {
        return repo.findById(id).orElse(null);
    }
}