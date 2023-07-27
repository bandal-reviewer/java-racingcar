package Domain;

import Generator.NumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    @DisplayName("자동차 이름은 쉼표(,)로 구분한다.")
    @Test
    public void carsSeparatorTest() {
        // given
        final String carNames = "메르세데스,포르쉐,아반떼";
        final List<Car> carNameList = new ArrayList<>(Arrays.asList(
                new Car("메르세데스"),
                new Car("포르쉐"),
                new Car("아반떼")
        ));

        // when
        final Cars cars = new Cars(carNames);

        // then
        assertThat(cars.getCars()).isEqualTo(carNameList);
    }

    @DisplayName("NumberGenerator의 generateNumber()가 4 이상의 값을 반환하면 자동차는 전진한다.")
    @Test
    public void carsMoveTest() {
        // given
        final String carNames = "메르세데스,포르쉐,아반떼";
        final Cars cars = new Cars(carNames);
        TestHighNumberGenerator testHighNumberGenerator = new TestHighNumberGenerator();

        // when
        cars.moveAll(testHighNumberGenerator);

        // then
        assertThat(cars.getCars().get(0).position).isEqualTo(1);
        assertThat(cars.getCars().get(1).position).isEqualTo(1);
        assertThat(cars.getCars().get(2).position).isEqualTo(1);
    }

    static class TestHighNumberGenerator implements NumberGenerator {
        @Override
        public int generateNumber() {
            return 4;
        }
    }

    @DisplayName("NumberGenerator의 generateNumber()가 4 미만의 값을 반환하면 자동차는 멈춘다.")
    @Test
    public void carsStopTest() {
        // given
        final String carNames = "메르세데스,포르쉐,아반떼";
        final Cars cars = new Cars(carNames);
        TestLowNumberGenerator testLowNumberGenerator = new TestLowNumberGenerator();

        // when
        cars.moveAll(testLowNumberGenerator);

        // then
        assertThat(cars.getCars().get(0).position).isEqualTo(0);
        assertThat(cars.getCars().get(1).position).isEqualTo(0);
        assertThat(cars.getCars().get(2).position).isEqualTo(0);
    }

    static class TestLowNumberGenerator implements NumberGenerator {
        @Override
        public int generateNumber() {
            return 3;
        }
    }
}
