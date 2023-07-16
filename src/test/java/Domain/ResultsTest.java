package Domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ResultsTest {
    @DisplayName("주어진 횟수 동안 자동차는 전진 또는 멈출 수 있다.")
    @Test
    public void carsRaceTest() {
        // given
        final Cars cars = new Cars("메르세데스,포르쉐,아반떼");
        final int tryCount = 5;

        // when
        final Results results = new Results(tryCount, cars);

        // then
        assertThat(results.getResults()).hasSize(tryCount);
    }
}
