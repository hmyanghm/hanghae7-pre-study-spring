package com.prestudy.hanghae.board;

import com.prestudy.hanghae.dto.request.BoardRequest;
import com.prestudy.hanghae.response.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@Tag(name = "Board API 명세서")
public class BoardController {

    private final BoardService boardService;

    @PostMapping(value = "/api/v1/board/register")
    @Operation(summary = "게시판 생성")
    public ApiResponse<?> register(@RequestBody BoardRequest boardRequest) {
        return ApiResponse.created(boardService.register(boardRequest));
    }

}
