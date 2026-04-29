package com.harsh.movieapp.repository;

import com.harsh.movieapp.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Long> {

    @Query("SELECT a.name, m.title FROM Actor a INNER JOIN a.movie m")
    List<Object[]> getActorMovieData();
}