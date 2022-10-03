package com.example.codetestweb.dto;

public class BoardWriteDto {

    public BoardWriteDto(String title, String content, String reg_name) {
        this.title = title;
        this.content = content;
        this.reg_name = reg_name;
    }

    private String title;
    private String content;
    private String reg_name;
}
