package com.example.entrevueSpringBoot.Repository;

import com.example.entrevueSpringBoot.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {

}
