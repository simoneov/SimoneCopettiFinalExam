package com.euris.SimoneCopettiExam.services.impl;

import com.euris.SimoneCopettiExam.models.Rooms;
import com.euris.SimoneCopettiExam.models.Tickets;
import com.euris.SimoneCopettiExam.repositories.RoomsRepository;
import com.euris.SimoneCopettiExam.repositories.SpectatorsRepository;
import com.euris.SimoneCopettiExam.repositories.TicketsRepository;
import com.euris.SimoneCopettiExam.services.IRoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomsService implements IRoomsService {

    @Autowired
    private RoomsRepository roomsRepository;
    @Autowired
    private SpectatorsRepository spectatorsRepository;


    @Override
    public Rooms save(Rooms room) {

        roomsRepository.save(room);

        return room;
    }

    @Override
    public Rooms update(Rooms room) {
        Optional<Rooms> optionalRoom = roomsRepository.findById(room.getId());
        if (optionalRoom.isPresent()) {
            roomsRepository.save(room);
        }
        return room;
    }

    @Override
    public List<Rooms> getAll() {
        return roomsRepository.findAll();
    }

    @Override
    public Optional<Rooms> get(Long id) {

        return roomsRepository.findById(id);
    }

    @Override
    public boolean delete(Long id) {
        roomsRepository.deleteById(id);
        return true;
    }

    @Override
    public void deleteAll() {

        roomsRepository.deleteAll();
    }


 //  public Double totalAmount(){
  //      spectatorsRepository.get
  // }


}
