package com.harsh.movieapp.controller;

import com.harsh.movieapp.entity.Movie;
import com.harsh.movieapp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.harsh.movieapp.service.ActorService;

@Controller
public class MovieController {

    @Autowired
    private MovieService service;
    @Autowired
    private ActorService actorService;

    @GetMapping("/addMovie")
    public String showForm(Model model) {
        model.addAttribute("movie", new Movie());
        return "addMovie";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("movies", service.getAll());
        model.addAttribute("joinData", actorService.getJoinData());
        model.addAttribute("actors", actorService.getAllActors());
        return "list";
    }

    @GetMapping("/editMovie/{id}")
    public String editMovie(@PathVariable Long id, Model model) {
        model.addAttribute("movie", service.getById(id));
        return "updateMovie";
    }

    @PostMapping("/updateMovie")
    public String updateMovie(@ModelAttribute Movie movie) {
        service.save(movie);
        return "redirect:/list";
    }
    @PostMapping("/saveMovie")
    public String saveMovie(@ModelAttribute Movie movie, Model model) {
        try {
            service.save(movie);
            return "redirect:/list";
        } catch (Exception e) {
            model.addAttribute("error", "Something went wrong!");
            return "addMovie";
        }
    }
}
