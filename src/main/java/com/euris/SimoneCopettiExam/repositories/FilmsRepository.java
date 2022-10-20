package com.euris.SimoneCopettiExam.repositories;

import com.euris.SimoneCopettiExam.models.Films;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmsRepository extends JpaRepository<Films, Long> {
}
