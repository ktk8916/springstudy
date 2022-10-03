package com.example.codetestweb.controller;

import com.example.codetestweb.domain.Board;
import com.example.codetestweb.dto.BoardDto;
import com.example.codetestweb.dto.BoardUpdateDto;
import com.example.codetestweb.dto.BoardWriteDto;
import com.example.codetestweb.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class BoardController {

    private BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/")
    @ResponseBody
    public List<Board> findAll(){
        return boardService.findAll();
    }

    @GetMapping("/{board_id}")
    @ResponseBody
    public BoardDto retrieveBoard(@PathVariable Long board_id){
        return boardService.retrieveBoard(board_id);
    }

    @GetMapping("/{title}")
    @ResponseBody
    public Optional<Board> findByTitle(@PathVariable String title){
        return boardService.findByTitle(title);
    }

    @PostMapping("/")
    public Board create(@RequestBody BoardWriteDto board){
        return boardService.save(board);
    }

    @DeleteMapping("/{board_id}")
    @ResponseBody
    public void delete(@PathVariable Long board_id){
        boardService.delete(board_id);
    }

    @PutMapping("/{board_id}")
    public void update(@PathVariable Long board_id, @RequestBody BoardUpdateDto board){
        boardService.update(board_id, board);
    }

}
