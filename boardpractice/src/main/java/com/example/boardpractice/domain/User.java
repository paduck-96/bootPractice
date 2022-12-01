package com.example.boardpractice.domain;

import lombok.Data;

@Data
public class User {
    private String email;
    private String nickname;
    private String password;

    /**
     * Data 어노테이션으로 인해서
     * getter 와 setter 자동 생성
     */
}
