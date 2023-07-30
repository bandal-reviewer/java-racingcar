package Domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnerTest {
    @DisplayName("가장 많이 움직인 자동차가 우승한다.")
    @Test
    public void winnerHasMaxPositionTest() {
        // given
        final Car car1 = new Car("메르세데스", 0);
        final Car car2 = new Car("아반떼", 1);
        final Car car3 = new Car("포르쉐", 2);
        final List<Car> cars = new ArrayList<>(List.of(car1, car2, car3));

        // when
        Winner winner = new Winner(cars);

        // then
        assertThat(winner.winner).isEqualTo(new ArrayList<>(List.of(car3)));
    }

    @DisplayName("우승자는 두 명 이상일 수 있다.")
    @Test
    public void winnerMoreThanOneTest() {
        // given
        final Car car1 = new Car("메르세데스", 1);
        final Car car2 = new Car("아반떼", 1);
        final Car car3 = new Car("포르쉐", 0);
        final List<Car> carList = new ArrayList<>(List.of(car1, car2, car3));
        final List<Car> winnerList = new ArrayList<>(List.of(car1, car2));

        // when
        Winner winner = new Winner(carList);

        // then
        assertThat(winner.winner).isEqualTo(winnerList);
    }
}
