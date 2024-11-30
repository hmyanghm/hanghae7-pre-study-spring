package com.prestudy.hanghae.board;

import com.prestudy.hanghae.dto.request.BoardReqDto;
import com.prestudy.hanghae.dto.request.PageReqDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@Tag(name = "Board API 명세서")
public class BoardController {

    private final BoardService boardService;

    @PostMapping(value = "/api/v1/board/register")
    @Operation(summary = "게시판 생성")
    public ResponseEntity<?> register(@RequestBody BoardReqDto boardReqDto) {
        return ResponseEntity.ok(boardService.register(boardReqDto));
    }

    @GetMapping(value = "/api/v1/board/page")
    @Operation(summary = "게시판 리스트 조회")
    public ResponseEntity<?> getBoardPage(
            @Parameter(name = "page", description = "페이지 번호", example = "1", required = true) int page,
            @Parameter(name = "size", description = "페이지 크기", example = "10", required = true) int size) {
        Pageable pageable = PageRequest.of(page-1, size, Sort.by("createdAt").descending());
        return ResponseEntity.ok(boardService.getAll(pageable));

    }

    @GetMapping(value = "/api/v1/board/{id}")
    @Operation(summary = "게시판 상세 조회")
    public ResponseEntity<?> getBoardDetail(@PathVariable long id) {
        return ResponseEntity.ok(boardService.getBoardDetail(id));
    }

    @PostMapping(value = "/api/v1/board/update")
    @Operation(summary = "게시판 수정")
    public ResponseEntity<?> update(@RequestBody BoardReqDto.Update updateDto) {
        return ResponseEntity.ok(boardService.update(updateDto));
    }

    @PostMapping(value = "/api/v1/board/delete")
    @Operation(summary = "게시판 삭제")
    public ResponseEntity<?> delete(@RequestBody BoardReqDto.Delete deleteDto) {
        boardService.delete(deleteDto);
        return ResponseEntity.ok().body("SUCCESS");
    }

}
