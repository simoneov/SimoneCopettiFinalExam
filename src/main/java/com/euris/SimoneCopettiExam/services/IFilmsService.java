package com.euris.SimoneCopettiExam.services;

import com.euris.SimoneCopettiExam.models.Films;
import com.euris.SimoneCopettiExam.models.Tickets;

import java.util.List;
import java.util.Optional;

public interface IFilmsService {
    public Films save(Films film);
    public Films update(Films film);
    public List<Films> getAll();
    public Optional<Films> get(Long id);
    public boolean delete(Long id);
    public void deleteAll();
}
