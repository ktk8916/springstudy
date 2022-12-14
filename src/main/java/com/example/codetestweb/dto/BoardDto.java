package com.example.codetestweb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class BoardDto {


    private long board_id;
    private String title;
    private String content;
    private long hits;
    private String reg_name;
    private Date datetime;

}
