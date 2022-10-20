package com.euris.SimoneCopettiExam.services.impl;

import com.euris.SimoneCopettiExam.models.Tickets;
import com.euris.SimoneCopettiExam.repositories.TicketsRepository;
import com.euris.SimoneCopettiExam.services.ITicketsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketsService implements ITicketsService {

    @Autowired
    private TicketsRepository ticketsRepository;


    @Override
    public Tickets save(Tickets ticket) {

        ticketsRepository.save(ticket);

        return ticket;
    }

    @Override
    public Tickets update(Tickets ticket) {
        Optional<Tickets> optionalTicket = ticketsRepository.findById(ticket.getId());
        if (optionalTicket.isPresent()) {
            ticketsRepository.save(ticket);
        }
        return ticket;
    }

    @Override
    public List<Tickets> getAll() {
        return ticketsRepository.findAll();
    }

    @Override
    public Optional<Tickets> get(Long id) {

        return ticketsRepository.findById(id);
    }

    @Override
    public boolean delete(Long id) {
        ticketsRepository.deleteById(id);
        return true;
    }

    @Override
    public void deleteAll() {
        ticketsRepository.deleteAll();
    }
}
