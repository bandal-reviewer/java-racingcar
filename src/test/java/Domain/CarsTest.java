package Domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarsTest {

    @DisplayName("자동차 이름은 쉼표(,)로 구분할 수 있다.")
    @Test
    public void carsTest1() {
        // given
        final String carNames = "메르세데스,포르쉐,아반떼";
        final List<String> carNameList = new ArrayList<>(Arrays.asList(
                "메르세데스",
                "포르쉐",
                "아반떼"
        ));
        final Cars cars = new Cars();

        // when
        List<String> resultCarList = cars.convertCarNamesToList(carNames);

        // then
        Assertions.assertThat(resultCarList).isEqualTo(carNameList);
    }
}
