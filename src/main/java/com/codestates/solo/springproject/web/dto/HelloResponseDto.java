package com.codestates.solo.springproject.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // 선언된 모든 필드의 GET 메소드 생성
@RequiredArgsConstructor //선언된 모든 final 필드가 포함된 생성자를 생성해줌. final있는거만!
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
