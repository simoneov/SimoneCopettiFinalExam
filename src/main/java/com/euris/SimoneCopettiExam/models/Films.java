package com.euris.SimoneCopettiExam.models;

import com.euris.SimoneCopettiExam.dtos.films.FilmsDto;
import com.euris.SimoneCopettiExam.enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name = "films")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Films {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String author;

    @Column
    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Column
    private Integer length;


    @OneToOne(mappedBy = "films")
    private Rooms rooms;

    public Integer minimalAge() {
        if (this.genre == Genre.HORROR) {
            return 18;
        }
        return 0;
    }


    public FilmsDto toDto() {

        return FilmsDto.builder()
                .author(this.author)
                .genre(this.genre)
                .minimalAge(this.minimalAge())
                .roomsId(rooms.getId())
                .length(this.length)
                .title(this.title).build();
    }

}
