package com.example.codetestweb.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long board_id;
    private String title;
    private String content;
    private long hits;
    private String reg_name;
    @CreationTimestamp
    private Date reg_dttm;

    @Builder
    public Board(String title, String content, String reg_name){
        this.title = title;
        this.content = content;
        this.reg_name = reg_name;
    }

    public void updateBoardValue(String title, String content){
        this.title = title;
        this.content = content;
    }

    public void increaseHits(long hits){
        this.hits = hits++;
    }
}
