package com.example.codetestweb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BoardWriteDto {

    private String title;
    private String content;
    private String reg_name;
}


