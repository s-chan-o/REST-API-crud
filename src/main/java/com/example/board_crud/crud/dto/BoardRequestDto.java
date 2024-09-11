package com.example.board_crud.crud.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BoardRequestDto {
    private String title;
    private String content;
    private String password;
}
