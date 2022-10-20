package com.euris.SimoneCopettiExam.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "rooms")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Rooms {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer seats;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "rooms")
    @JsonManagedReference(value = "idRooms")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Spectators> spectators;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idRooms", referencedColumnName = "id")
    private Films films;


}
