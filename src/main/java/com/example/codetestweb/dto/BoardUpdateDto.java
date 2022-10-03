package com.example.codetestweb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public class BoardUpdateDto {

    private String title;
    private String content;
}
