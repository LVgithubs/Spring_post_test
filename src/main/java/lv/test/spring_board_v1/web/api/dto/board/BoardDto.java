
package lv.test.spring_board_v1.web.api.dto.board;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lv.test.spring_board_v1.domain.board.Board;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {
    private String title;
    private String content;

    public Board toEntity() {
        Board board = new Board();
        board.setTitle(this.title);
        board.setContent(this.content);
        return board;
    }

}