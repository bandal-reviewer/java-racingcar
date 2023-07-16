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

    @DisplayName("가장 많이 움직인 자동차가 우승한다.")
    @Test
    public void winnerTest3() {
        // given
        final Car car1 = new Car("메르세데스");
        final Car car2 = new Car("아반떼");
        final Car car3 = new Car("포르쉐");
        final List<Car> cars = new ArrayList<>(List.of(car1, car2, car3));

        // when
        car2.move(4);
        car3.move(4);
        car3.move(4);
        Winner winner = new Winner(cars);

        // then
        assertThat(winner.winner).isEqualTo(new ArrayList<>(List.of(car3)));
    }
}
