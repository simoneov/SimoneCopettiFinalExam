package com.euris.SimoneCopettiExam.controllers;

import com.euris.SimoneCopettiExam.dtos.films.FilmsDto;
import com.euris.SimoneCopettiExam.dtos.films.FilmsPutRequest;
import com.euris.SimoneCopettiExam.dtos.tickets.TicketsDto;
import com.euris.SimoneCopettiExam.dtos.tickets.TicketsPostRequest;
import com.euris.SimoneCopettiExam.models.Films;
import com.euris.SimoneCopettiExam.models.Tickets;
import com.euris.SimoneCopettiExam.services.impl.FilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmsController {

    @Autowired
    private FilmsService filmsService;


    @GetMapping
    public List<FilmsDto> getAll() {
        List<Films> filmsList = filmsService.getAll();
        List<FilmsDto> FilmsDtos = new ArrayList<>();
        filmsList.forEach(film -> FilmsDtos.add(film.toDto()));
        return FilmsDtos;
    }

    @GetMapping("/{id}")
    public FilmsDto getById(@PathVariable Long id) {

        return filmsService.get(id).get().toDto();
    }

    @PostMapping
    public Films save(@RequestBody FilmsDto film) {
        return filmsService.save(film.toModel());
    }

    @DeleteMapping
    public void deleteAll() {
        filmsService.deleteAll();
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Long id) {
        return filmsService.delete(id);
    }


    @PutMapping
    public Films update(@RequestBody FilmsPutRequest film) {

        return filmsService.update(film.toModel());
    }
}
