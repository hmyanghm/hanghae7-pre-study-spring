package com.prestudy.hanghae.board;

import com.prestudy.hanghae.dto.request.BoardRequest;
import com.prestudy.hanghae.entity.Board;
import com.prestudy.hanghae.utils.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class BoardServiceImpl implements BoardService{

    private final BoardRepository boardRepository;

    @Override
    public Board register(BoardRequest boardRequest) {

        Board board = Board.builder()
                .memberId(1)
                .title(boardRequest.getTitle())
                .content(boardRequest.getContent())
                .createdAt(DateUtil.getNow_KST())
                .updatedAt(DateUtil.getNow_KST())
                .isUse(true)
                .build();

        return boardRepository.save(board);
    }
}
