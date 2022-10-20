package com.euris.SimoneCopettiExam.dtos.tickets;

import com.euris.SimoneCopettiExam.models.Spectators;
import com.euris.SimoneCopettiExam.models.Tickets;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketsPostRequest {

    private String position;

    private Double price;

    public Tickets toModel() {
        return Tickets.builder()
                .position(this.position)
                .price(this.price).build();

    }

}
