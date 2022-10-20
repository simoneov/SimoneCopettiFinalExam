package com.euris.SimoneCopettiExam.services;

import com.euris.SimoneCopettiExam.models.Tickets;

import java.util.List;
import java.util.Optional;

public interface ITicketsService {
    public Tickets save(Tickets ticket);
    public Tickets update(Tickets ticket);
    public List<Tickets> getAll();
    public Optional<Tickets> get(Long id);
    public boolean delete(Long id);
    public void deleteAll();
}
