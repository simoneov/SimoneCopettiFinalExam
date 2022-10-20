package com.euris.SimoneCopettiExam.dtos.films;

import com.euris.SimoneCopettiExam.enums.Genre;
import com.euris.SimoneCopettiExam.models.Films;
import com.euris.SimoneCopettiExam.models.Rooms;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FilmsDto {

    private String title;

    private String author;


    private Genre genre;

    private Integer length;

    private Integer minimalAge;



    private Long roomsId;

    public Films toModel() {
        Rooms room = Rooms.builder()
                .id(roomsId).build();

        return Films.builder()
                .title(this.title)
                .author(this.author)
                .rooms(room)
                .genre(this.genre)
                .length(this.length)
                .build();

    }


}
