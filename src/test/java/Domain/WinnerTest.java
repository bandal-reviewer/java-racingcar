package Domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnerTest {
    @DisplayName("우승자는 한 명 이상일 수 있다.")
    @Test
    public void winnerTest2() {
        // given
        final Car car1 = new Car("메르세데스");
        final Car car2 = new Car("아반떼");
        final List<Car> winnerList = new ArrayList<>(Arrays.asList(car1, car2));

        // when
        Winner winner = new Winner(winnerList);

        // then
        assertThat(winner.winner).isEqualTo(winnerList);
    }
}
