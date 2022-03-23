package lv.test.spring_board_v1.web.api;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lv.test.spring_board_v1.service.BoardService;
import lv.test.spring_board_v1.web.api.dto.ResponseDto;
import lv.test.spring_board_v1.web.api.dto.board.BoardDto;
import lv.test.spring_board_v1.web.api.dto.board.BoardSearch;

@RequiredArgsConstructor
@RestController
public class BoardApiController {
    private final HttpSession session;
    private final BoardService boardService;

    @PostMapping("/api/write")
    public ResponseDto<String> write(@RequestBody BoardDto boardDto) {
        boardService.작성하기(boardDto);
        return new ResponseDto<String>(1, "작성성공", null);
    }

}
