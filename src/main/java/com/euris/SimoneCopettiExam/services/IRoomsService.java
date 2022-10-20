package com.euris.SimoneCopettiExam.services;

import com.euris.SimoneCopettiExam.models.Rooms;
import com.euris.SimoneCopettiExam.models.Spectators;

import java.util.List;
import java.util.Optional;

public interface IRoomsService {
    public Rooms save(Rooms room);
    public Rooms update(Rooms room);
    public List<Rooms> getAll();
    public Optional<Rooms> get(Long id);
    public boolean delete(Long id);
    public void deleteAll();

}
