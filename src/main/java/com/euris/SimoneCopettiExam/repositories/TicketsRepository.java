package com.euris.SimoneCopettiExam.repositories;

import com.euris.SimoneCopettiExam.models.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketsRepository extends JpaRepository<Tickets, Long> {

}
