package com.example.board_crud.crud.repository;

import com.example.board_crud.crud.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    //List<BoardListResponseDto> findALlByOrderByModifiedAtDesc();
}
