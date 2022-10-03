package com.example.codetestweb.domain;

import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
public class Board {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long board_id;
    private String title;
    private String content;
    private long hits;
    private String reg_name;
    @CreationTimestamp
    private Date reg_dttm;

}
