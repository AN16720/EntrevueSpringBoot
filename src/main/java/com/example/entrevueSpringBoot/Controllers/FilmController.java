package com.example.entrevueSpringBoot.Controllers;

import com.example.entrevueSpringBoot.Service.FilmService;
import com.example.entrevueSpringBoot.Models.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FilmController {

    @Autowired
    FilmService filmService;

    @GetMapping("/api/film/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Film getFilm(@PathVariable("id") long id) {
        return filmService.getFilm(id);
    }

    @PostMapping("/api/film")
    @ResponseStatus(HttpStatus.CREATED)
    public Film postFilm(@RequestBody Film film) {
        filmService.addFilm(film);
        return film;
    }
}
