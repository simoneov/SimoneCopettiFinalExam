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
public class FilmsPutRequest {

    private Long id;
    private String title;

    private String author;


    private Genre genre;

    private Integer length;





    public Films toModel() {


        return Films.builder()
                .title(this.title)
                .author(this.author)
                .id(this.id)
                .genre(this.genre)
                .length(this.length)
                .build();

    }
}
