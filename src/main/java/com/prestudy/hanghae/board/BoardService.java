package com.prestudy.hanghae.board;

import com.prestudy.hanghae.dto.request.BoardReqDto;
import com.prestudy.hanghae.dto.response.BoardResDto;
import com.prestudy.hanghae.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardService {
    Board register(BoardReqDto boardReqDto);

    BoardResDto getAll(Pageable pageable);

    BoardResDto.DetailDto getBoardDetail(long id);

    BoardResDto.DetailDto update(BoardReqDto.Update updateDto);

    void delete(BoardReqDto.Delete deleteDto);
}
