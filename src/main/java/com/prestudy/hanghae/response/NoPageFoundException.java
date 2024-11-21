package com.prestudy.hanghae.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class NoPageFoundException extends RuntimeException {

    private final ErrorCode errorCode;

    public String getMessage() {
        return errorCode.getMessage();
    }
}
