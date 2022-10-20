package com.euris.SimoneCopettiExam.models;

import com.euris.SimoneCopettiExam.dtos.tickets.TicketsDto;
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
    private Double price;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idTickets", referencedColumnName = "id")
    private Spectators spectators;

    public TicketsDto toDto() {
        return TicketsDto.builder()
                .id(this.getId())
                .position(this.position)
                .price(this.price)
                .build();
    }
}
