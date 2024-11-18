package com.prestudy.hanghae.board;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@OpenAPIDefinition(
        info = @Info(title = "Board API 명세서", version = "v1")
)
public class BoardController {

    @PostMapping(value = "/api/v1/board/register", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "게시판 생성")
    public ResponseEntity<?> register() {

        return ResponseEntity.ok().build();
    }

}
