package com.harsh.movieapp.controller;

import com.harsh.movieapp.entity.Actor;
import com.harsh.movieapp.service.ActorService;
import com.harsh.movieapp.service.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ActorController {

    @Autowired
    private ActorService actorService;

    @Autowired
    private MovieService movieService;

    @GetMapping("/addActor")
    public String form(Model model) {
        model.addAttribute("actor", new Actor());
        model.addAttribute("movies", movieService.getAll());
        return "addActor";
    }

    @PostMapping("/saveActor")
    public String save(@ModelAttribute Actor actor) {
        actorService.save(actor);
        return "redirect:/list";
    }
}