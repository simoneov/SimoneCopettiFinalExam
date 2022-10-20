package com.euris.SimoneCopettiExam.controllers;


import com.euris.SimoneCopettiExam.dtos.tickets.TicketsDto;
import com.euris.SimoneCopettiExam.dtos.tickets.TicketsPostRequest;
import com.euris.SimoneCopettiExam.models.Tickets;
import com.euris.SimoneCopettiExam.services.impl.TicketsService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketsController {
    private TicketsService ticketsService;

    public TicketsController(TicketsService ticketsService) {
        this.ticketsService = ticketsService;
    }

    @GetMapping
    public List<TicketsDto> getAll() {
        List<Tickets> listaTickets = ticketsService.getAll();
        List<TicketsDto> ticketsDtos = new ArrayList<>();
        listaTickets.forEach(ticket -> ticketsDtos.add(ticket.toDto()));
        return ticketsDtos;
    }

    @GetMapping("/{id}")
    public TicketsDto getById(@PathVariable Long id) {

        return ticketsService.get(id).get().toDto();
    }

    @PostMapping
    public Tickets save(@RequestBody TicketsPostRequest ticket) {
        return ticketsService.save(ticket.toModel());
    }

    @DeleteMapping
    public void deleteAll() {
        ticketsService.deleteAll();
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Long id) {
        return ticketsService.delete(id);
    }


    @PutMapping
    public Tickets update(@RequestBody TicketsDto ticket) {
        return ticketsService.update(ticket.toModel());
    }

}
