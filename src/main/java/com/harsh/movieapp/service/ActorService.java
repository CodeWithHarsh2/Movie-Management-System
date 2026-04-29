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

    // 🔥 ADD THIS METHOD
    public List<Object[]> getJoinData() {
        return repo.getActorMovieData();
    }
}