package lv.test.spring_board_v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBoardV1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoardV1Application.class, args);
	}

}
