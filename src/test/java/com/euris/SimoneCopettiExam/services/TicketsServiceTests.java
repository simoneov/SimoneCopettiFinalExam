package com.euris.SimoneCopettiExam.services;

import com.euris.SimoneCopettiExam.dtos.tickets.TicketsPostRequest;
import com.euris.SimoneCopettiExam.models.Tickets;
import com.euris.SimoneCopettiExam.repositories.TicketsRepository;
import com.euris.SimoneCopettiExam.services.impl.TicketsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;

import java.util.Optional;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@TestPropertySource(locations = "classpath:application-test.properties")
public class TicketsServiceTests {


    @Mock
    private TicketsRepository ticketsRepository;

    @InjectMocks
    private TicketsService ticketsService;

    @Test
    public void insertATicketWorksTest() {
        TicketsPostRequest ticket = TicketsPostRequest.builder()
                .position("3c")
                .price(33.3).build();
        Mockito.when(ticketsRepository.save(Mockito.any(Tickets.class))).thenReturn(new Tickets());
        Tickets created = ticketsService.save(ticket.toModel());
        Assertions.assertEquals("3c", created.getPosition());
        Assertions.assertEquals(33.3, created.getPrice());

    }


  //  @Test
  //  public void getATicketWorksTest() {
  //      TicketsPostRequest ticket = TicketsPostRequest.builder()
  //              .position("3c")
  //              .price(33.3).build();
  //      Mockito.when(ticketsRepository.save(Mockito.any(Tickets.class))).thenReturn(new Tickets());
  //      Tickets created = ticketsService.save(ticket.toModel());
  //      Assertions.assertEquals("3c", created.getPosition());
  //      Assertions.assertEquals(33.3, created.getPrice());
//
  //  }



}
