package com.euris.SimoneCopettiExam.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class GenericResponse {

    private HttpStatus statusCode;
    private Object body;

}

