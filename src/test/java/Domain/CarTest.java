package Domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

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

    @DisplayName("자동차의 이름은 5자를 초과할 수 없다.")
    @ValueSource(strings = {"", "Mercedes"})
    @ParameterizedTest
    public void carNameLengthTest(String carName) {
        // given

        // when
        // then
        assertThatThrownBy(() -> new Car(carName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[Error]");
    }

    @DisplayName("자동차는 전진할 수 있다.")
    @Test
    public void carMoveTest() {
        // given
        final int position = 1;
        final Car car = new Car("메르세데스");

        // when
        car.move();

        // then
        assertThat(car.position).isEqualTo(position);
    }
}
