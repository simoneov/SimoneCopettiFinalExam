package com.euris.SimoneCopettiExam.dtos.tickets;

import com.euris.SimoneCopettiExam.models.Spectators;
import com.euris.SimoneCopettiExam.models.Tickets;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketsDto {


    private Long id;


    private String position;

    private Double price;

    public Tickets toModel() {
        return Tickets.builder()
                .id(this.id)
                .position(this.position)
                .price(this.price)
                .build();
    }


}
