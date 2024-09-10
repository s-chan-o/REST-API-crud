package com.example.board_crud.crud.Dto;

import com.example.board_crud.crud.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.Optional;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BoardListResponseDto {
    //제목
    private String title;
    //작성자명
    private String username;
    private String content;
    //Entity -> dto
    public BoardListResponseDto(Board board){
        this.title = board.getTitle();
        this.content = board.getContent();
    }
    public BoardListResponseDto(Optional<Board> board){
        this.title = board.get().getTitle();
        this.content = board.get().getContent();
    }
}