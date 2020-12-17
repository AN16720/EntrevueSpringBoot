package com.example.entrevueSpringBoot.Service;

import com.example.entrevueSpringBoot.Repository.FilmRepository;
import com.example.entrevueSpringBoot.models.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmService {

    @Autowired
    FilmRepository filmRepository;

    public Film getFilm(Long id) {
        return filmRepository.findById(id).get();
    }

    public void addFilm(Film film) {
        filmRepository.save(film);
    }
}
