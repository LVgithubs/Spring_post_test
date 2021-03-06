package lv.test.spring_board_v1.domain.board;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoardRespository extends JpaRepository<Board, Integer> {

    @Query(value = "SELECT * FROM board WHERE title like %:keyword%", nativeQuery = true)
    List<Board> mSearch(@Param("keyword") String keyword);
}
