package com.euris.SimoneCopettiExam.services;

import com.euris.SimoneCopettiExam.models.Films;
import com.euris.SimoneCopettiExam.models.Spectators;

import java.util.List;
import java.util.Optional;

public interface ISpectatorsService {

    public Spectators save(Spectators spectator);
    public Spectators update(Spectators spectator);
    public List<Spectators> getAll();
    public Optional<Spectators> get(Long id);
    public boolean delete(Long id);
    public void deleteAll();

}
