package com.euris.SimoneCopettiExam.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "tickets")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tickets {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String position;

    @Column
    private Integer price;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idTickets", referencedColumnName = "id")
    private Spectators spectator;

}
