package com.prestudy.hanghae.board;

import com.prestudy.hanghae.dto.request.BoardRequest;
import com.prestudy.hanghae.entity.Board;

public interface BoardService {
    Board register(BoardRequest boardRequest);
}
