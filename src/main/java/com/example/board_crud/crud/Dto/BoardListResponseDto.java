package com.example.board_crud.crud.Dto;

import com.example.board_crud.crud.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Optional;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BoardListResponseDto {
    //제목
    private String title;
    //작성자명
    private String username;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    //Entity -> dto
    public BoardListResponseDto(BoardEntity board){
        this.title = board.getTitle();
    }
    public BoardListResponseDto(Optional<BoardEntity> board){
        this.title = board.get().getTitle();
    }
}