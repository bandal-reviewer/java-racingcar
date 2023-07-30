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
        final Car testCar = new Car(carName);

        // then
        assertThat(testCar.name).isEqualTo(carName);
    }

    @DisplayName("자동차의 이름은 빈칸일 수 없으며, 5자를 초과할 수 없다.")
    @ValueSource(strings = {"", " ", "Mercedes"})
    @ParameterizedTest
    public void carNameLengthTest(String carName) {
        // given

        // when
        // then
        assertThatThrownBy(() -> new Car(carName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[Error]");
    }

    @DisplayName("자동차의 이름은 공백일 수 없다.")
    @Test
    public void carNameEmptyTest() {
        // given
        // when
        // then
        assertThatThrownBy(() -> new Car("  "))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[Error]");
    }

    @DisplayName("자동차는 4 이상의 값을 받으면 전진할 수 있다.")
    @Test
    public void carMoveTest() {
        // given
        final int position = 1;
        final Car testCar = new Car("메르세데스");

        // when
        testCar.move(4);

        // then
        assertThat(testCar.position).isEqualTo(position);
    }

    @DisplayName("자동차는 4 미만의 값을 받으면 멈춘다.")
    @Test
    public void carStopTest() {
        // given
        final int position = 0;
        final Car testCar = new Car("메르세데스");

        // when
        testCar.move(3);

        // then
        assertThat(testCar.position).isEqualTo(position);
    }
}
