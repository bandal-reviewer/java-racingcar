import Domain.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {
    @DisplayName("자동차는 이름을 가진다.")
    @Test
    public void carNameTest() {
        // given
        final String carName = "메르세데스";

        // when
        final Car car = new Car(carName);

        // then
        assertThat(car.name).isEqualTo(carName);
    }
}
