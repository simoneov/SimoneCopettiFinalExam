package com.euris.SimoneCopettiExam.services.impl;

import com.euris.SimoneCopettiExam.models.Films;
import com.euris.SimoneCopettiExam.models.Rooms;
import com.euris.SimoneCopettiExam.repositories.FilmsRepository;
import com.euris.SimoneCopettiExam.repositories.RoomsRepository;
import com.euris.SimoneCopettiExam.services.IFilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmsService implements IFilmsService {
    @Autowired
    FilmsRepository filmsRepository;
    @Autowired
    RoomsRepository roomsRepository;

    @Override
    public Films save(Films film) {
        Optional<Rooms> optionalRoom = roomsRepository.findById(film.getRooms().getId());
        if (optionalRoom.isPresent()) {
            filmsRepository.save(film);
        }
        return film;
    }

    @Override
    public Films update(Films film) {
        Optional<Films> optionalFilm = filmsRepository.findById(film.getId());
        if (optionalFilm.isPresent()) {
            filmsRepository.save(film);
        }
        return film;
    }

    @Override
    public List<Films> getAll() {
        return filmsRepository.findAll();
    }

    @Override
    public Optional<Films> get(Long id) {


        return filmsRepository.findById(id);
    }

    @Override
    public boolean delete(Long id) {
        filmsRepository.deleteById(id);
        return true;
    }

    @Override
    public void deleteAll() {

        filmsRepository.deleteAll();
    }
}
