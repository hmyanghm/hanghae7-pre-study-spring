package com.prestudy.hanghae.board;

import com.prestudy.hanghae.common.exception.CustomException;
import com.prestudy.hanghae.common.exception.ErrorCode;
import com.prestudy.hanghae.dto.request.BoardReqDto;
import com.prestudy.hanghae.dto.response.BoardResDto;
import com.prestudy.hanghae.entity.Board;
import com.prestudy.hanghae.member.MemberService;
import com.prestudy.hanghae.utils.ConvertUtil;
import com.prestudy.hanghae.utils.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
@Slf4j
public class BoardServiceImpl implements BoardService{

    private final BoardRepository boardRepository;
    private final MemberService memberService;
    @Override
    public Board register(BoardReqDto boardReqDto) {

        if (StringUtils.isEmpty(boardReqDto.getTitle()) || StringUtils.isEmpty(boardReqDto.getContent())) {
            throw new CustomException(ErrorCode.REQUIRED_COLUMN);
        }

        Board board = Board.builder()
                .member(memberService.getById(1L))
                .title(boardReqDto.getTitle())
                .content(boardReqDto.getContent())
                .createdAt(DateUtil.getNow_KST())
                .updatedAt(DateUtil.getNow_KST())
                .isUse(true)
                .build();

        return boardRepository.save(board);
    }

    @Override
    public BoardResDto getAll(Pageable pageable) {

        Page<BoardResDto.DetailDto> detailDtos = boardRepository.findAllByIsUseTrue(pageable).map(board -> {
            BoardResDto.DetailDto boardDto = new BoardResDto.DetailDto();
            if (board.isUse()) {
                ConvertUtil.convert(board, boardDto);
                boardDto.setMemberName(memberService.getMemberName(board.getMember().getId()));
            }
            return boardDto;
        });

        return BoardResDto.builder()
                .list(detailDtos.getContent())
                .page(detailDtos.getNumber())
                .size(detailDtos.getSize())
                .totalCount(detailDtos.getTotalElements())
                .totalPage(detailDtos.getTotalPages())
                .build();
    }

    public BoardResDto.DetailDto getBoardDetail(long id) {
        Board board = getById(id);

        if (!board.isUse()) {
            throw new CustomException(ErrorCode.BOARD_DELETE);
        }

        BoardResDto.DetailDto boardDto = new BoardResDto.DetailDto();
        ConvertUtil.convert(board, boardDto);
        boardDto.setMemberName(memberService.getMemberName(board.getMember().getId()));
        return boardDto;
    }

    @Override
    public BoardResDto.DetailDto update(BoardReqDto.Update updateDto) {
        Board board = getById(updateDto.getId());
        board.setTitle(updateDto.getTitle().isEmpty() ? board.getTitle() : updateDto.getTitle());
        board.setContent(updateDto.getContent().isEmpty() ? board.getContent() : updateDto.getContent());

        BoardResDto.DetailDto res = new BoardResDto.DetailDto();
        ConvertUtil.convert(board, res);

        memberService.isCorrectPassword(board.getMember().getId(), updateDto.getPassword());
        boardRepository.save(board);
        return res;
    }

    @Override
    public void delete(BoardReqDto.Delete deleteDto) {
        Board board = getById(deleteDto.getId());
        board.setUse(false);
        memberService.isCorrectPassword(board.getMember().getId(), deleteDto.getPassword());
        boardRepository.save(board);
    }

    public Board getById(long id) {
        Optional<Board> boardOptional = boardRepository.findById(id);
        if (boardOptional.isEmpty()) {
            throw new CustomException(ErrorCode.BOARD_NOT_FOUND);
        } else if (!boardOptional.get().isUse()) {
            throw new CustomException(ErrorCode.BOARD_DELETE);
        }

        return boardOptional.get();
    }

}
