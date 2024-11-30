package com.prestudy.hanghae.common.exception;

import com.prestudy.hanghae.utils.Message;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    REQUIRED_COLUMN(400, HttpStatus.INTERNAL_SERVER_ERROR, Message.getMessage("message.error.member.not.exist")),
    UNAUTHORIZED(401, HttpStatus.UNAUTHORIZED, Message.getMessage("message.error.authorization")),
    NOT_FOUND_END_POINT(404, HttpStatus.NOT_FOUND, Message.getMessage("message.error.not.found.end-pont")),
    BOARD_NOT_FOUND(500, HttpStatus.INTERNAL_SERVER_ERROR, Message.getMessage("message.error.board.not.exist")),
    BOARD_DELETE(500, HttpStatus.INTERNAL_SERVER_ERROR, Message.getMessage("message.error.board.delete")),
    MEMBER_NOT_FOUND(500, HttpStatus.INTERNAL_SERVER_ERROR, Message.getMessage("message.error.member.not.exist"))

    ;

    private final Integer code;
    private final HttpStatus httpStatus;
    private final String message;
}
