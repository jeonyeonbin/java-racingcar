package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomMovableStrategyTest {

    @Test
    @DisplayName("랜덤값이 0~9 중 4이상 일 경우에만 이동할 값 1을 반환한다")
    void movedByNumberFourOrMoreTest(){
        RandomMovableStrategy randomMovable = new RandomMovableStrategy();
        int result = randomMovable.movedByNumberFourOrMore();
        assertThat(result).isLessThanOrEqualTo(1);
    }
}