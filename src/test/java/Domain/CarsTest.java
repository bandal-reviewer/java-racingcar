package Domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    private final Car car = new Car();

    @DisplayName("자동차 이름은 쉼표(,)로 구분할 수 있다.")
    @Test
    public void carsClassificationSymbolTest() {
        // given
        final String carNames = "메르세데스,포르쉐,아반떼";
        final List<Car> carNameList = new ArrayList<>(Arrays.asList(
                car.from("메르세데스"),
                car.from("포르쉐"),
                car.from("아반떼")
        ));

        // when
        final Cars cars = new Cars(carNames);

        // then
        assertThat(cars.getCars()).isEqualTo(carNameList);
    }
}
