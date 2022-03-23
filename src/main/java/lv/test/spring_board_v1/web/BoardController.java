package lv.test.spring_board_v1.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;
import lv.test.spring_board_v1.domain.board.Board;
import lv.test.spring_board_v1.domain.board.BoardRespository;
import lv.test.spring_board_v1.service.BoardService;
import lv.test.spring_board_v1.web.api.dto.board.BoardSearch;

@RequiredArgsConstructor
@Controller
public class BoardController {
    private final BoardRespository BoardRespository;
    private final BoardService boardService;

    // @RequestBody BoardSearch boardSearch
    @GetMapping({ "/", "board" })
    public String home(Model model, String keyword) {
        // 1. findAll() 호출
        // 2. model에 담기
        if (keyword == null) {
            model.addAttribute("boards", BoardRespository.mSearch(""));
        } else {
            model.addAttribute("boards", BoardRespository.mSearch(keyword));
        }
        return "board/list";
    }

    @GetMapping({ "/writeform" })
    public String write() {
        return "board/writeform";
    }

}
