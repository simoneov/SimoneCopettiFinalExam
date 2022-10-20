package com.euris.SimoneCopettiExam.repositories;

import com.euris.SimoneCopettiExam.models.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomsRepository extends JpaRepository<Rooms, Long> {

}
