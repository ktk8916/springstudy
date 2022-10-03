package com.example.codetestweb.service;

import com.example.codetestweb.domain.Board;
import com.example.codetestweb.dto.BoardDto;
import com.example.codetestweb.dto.BoardUpdateDto;
import com.example.codetestweb.dto.BoardWriteDto;
import com.example.codetestweb.repository.BoardRepository;
import com.example.codetestweb.repository.JPABoardRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;
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

    public Board BoardCheck(Long board_id){
        return findById(board_id).orElseThrow(() -> new NoSuchElementException("해당 게시글이 없습니다."));
    }

    public Optional<Board> findById(Long board_id){
        return boardRepository.findById(board_id);
    }

    public BoardDto retrieveBoard(Long board_id){
        Board board = BoardCheck(board_id);
        BoardDto returnBoardDto = new BoardDto(board.getBoard_id(), board.getTitle(), board.getContent(), board.getHits(), board.getReg_name(), board.getReg_dttm());
        return returnBoardDto;
    }

    public Optional<Board> findByTitle(String title){
        return boardRepository.findByTitle(title);
    }

    @Transactional
    public void update(Long board_id, BoardUpdateDto board){
        BoardCheck(board_id).updateBoardValue(board.getTitle(), board.getContent());
    }

    public Board save(BoardWriteDto board){

        Board board1 = new Board(board.getTitle(), board.getContent(), board.getReg_name());
        return boardRepository.save(board1);
    }

    public void delete(Long board_id){
        boardRepository.delete(BoardCheck(board_id));
    }

    public void increaseHits(Long hits){

    }
}
