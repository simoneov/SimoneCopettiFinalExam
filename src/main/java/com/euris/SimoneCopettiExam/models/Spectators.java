package com.euris.SimoneCopettiExam.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Table(name = "spectators")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Spectators {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private LocalDateTime birthdate;

    @OneToOne(mappedBy = "spectators")
    private Tickets tickets;

    public int age(){
      return  (LocalDateTime.now().getYear())-(birthdate.getYear());
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idRooms")
    @JsonBackReference(value = "idRooms")
    private Rooms rooms;


}

