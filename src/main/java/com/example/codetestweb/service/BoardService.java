package com.example.codetestweb.service;

import com.example.codetestweb.domain.Board;
import com.example.codetestweb.dto.BoardDto;
import com.example.codetestweb.repository.BoardRepository;
import com.example.codetestweb.repository.JPABoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {

    private JPABoardRepository boardRepository;

    public BoardService(JPABoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public List<Board> findAll(){
        return boardRepository.findAll();
    }

    public Optional<Board> findById(Long board_id){
        return boardRepository.findById(board_id);
    }

    public Optional<Board> findByTitle(String title){
        return boardRepository.findByTitle(title);
    }

    public Board save(Board board){
        return boardRepository.save(board);
    }

    public void delete(Long board_id){
        findById(board_id).ifPresent( i -> boardRepository.delete(i));
    }



}
