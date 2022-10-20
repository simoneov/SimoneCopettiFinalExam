package com.euris.SimoneCopettiExam.services.impl;

import com.euris.SimoneCopettiExam.models.Rooms;
import com.euris.SimoneCopettiExam.models.Spectators;
import com.euris.SimoneCopettiExam.models.Tickets;
import com.euris.SimoneCopettiExam.repositories.RoomsRepository;
import com.euris.SimoneCopettiExam.repositories.SpectatorsRepository;
import com.euris.SimoneCopettiExam.repositories.TicketsRepository;
import com.euris.SimoneCopettiExam.services.ISpectatorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpectatorsService implements ISpectatorsService {

    @Autowired
    TicketsRepository ticketsRepository;
    @Autowired
    SpectatorsRepository spectatorsRepository;
    @Autowired
    RoomsRepository roomsRepository;


    @Override
    public Spectators save(Spectators spectator) {
        Optional<Rooms> optionalRoom = roomsRepository.findById(spectator.getRooms().getId());
        Optional<Tickets> optionalTicket = ticketsRepository.findById(spectator.getTickets().getId());

        if (optionalRoom.isPresent() && optionalTicket.isPresent()) {
            spectatorsRepository.save(spectator);
        }
        return spectator;
    }

    @Override
    public Spectators update(Spectators spectator) {
        Optional<Spectators> optionalSpectator = spectatorsRepository.findById(spectator.getId());
        if(optionalSpectator.isPresent()){
            spectatorsRepository.save(spectator);
        }
        return spectator;
    }

    @Override
    public List<Spectators> getAll() {
        return spectatorsRepository.findAll();
    }

    @Override
    public Optional<Spectators> get(Long id) {
        return spectatorsRepository.findById(id);
    }

    @Override
    public boolean delete(Long id) {
        spectatorsRepository.deleteById(id);
        return true;
    }

    @Override
    public void deleteAll() {
        spectatorsRepository.deleteAll();
    }
}
