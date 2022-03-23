package lv.test.spring_board_v1.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lv.test.spring_board_v1.domain.board.Board;
import lv.test.spring_board_v1.domain.board.BoardRespository;
import lv.test.spring_board_v1.web.api.dto.board.BoardDto;
import lv.test.spring_board_v1.web.api.dto.board.BoardSearch;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRespository boardRespository;

    @Transactional
    public void 작성하기(BoardDto boardDto) {
        boardRespository.save(boardDto.toEntity());
    }

    @Transactional
    public List<Board> 검색하기(BoardSearch boardSearch) {
        List<Board> boardEntity = boardRespository.mSearch(boardSearch.getKeyword());
        return boardEntity;
    }

}
