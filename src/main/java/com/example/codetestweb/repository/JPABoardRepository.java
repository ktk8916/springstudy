package com.example.codetestweb.repository;

import com.example.codetestweb.domain.Board;
import com.example.codetestweb.dto.BoardDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
public interface JPABoardRepository extends JpaRepository<Board, Long>, BoardRepository {
    public Optional<Board> findByTitle(String title);
}
