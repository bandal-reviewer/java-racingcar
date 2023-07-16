package Domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    @DisplayName("자동차 이름은 쉼표(,)로 구분한다.")
    @Test
    public void carsClassificationSymbolTest() {
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
        assertThat(cars.getCars()).usingRecursiveComparison().isEqualTo(carNameList);
    }
}
