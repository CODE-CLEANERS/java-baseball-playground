package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import baseball.model.Computer;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BaseBallTest {

    @Test
    @DisplayName("컴퓨터 숫자 생성 테스트")
    void CREATE_RANDOM_NUMBER() {
        //given
        Computer computer = new Computer();
        computer.createAnswer();

        //when
        HashMap<Integer, Integer> number = computer.getAnswer();

        //then
        assertThat(number.size()).isEqualTo(3);
    }
}
