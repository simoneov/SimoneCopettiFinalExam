package com.euris.SimoneCopettiExam.repositories;

import com.euris.SimoneCopettiExam.models.Spectators;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpectatorsRepository extends JpaRepository<Spectators, Long> {

}
