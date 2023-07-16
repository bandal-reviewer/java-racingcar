package Domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class TryCountTest {

    @DisplayName("시도할 횟수를 0회로 작성하면 예외가 발생한다.")
    @Test
    public void tryCountTest() {
        // given
        final String testTryCount = "0";

        // when
        // then
        assertThatThrownBy(() -> new TryCount(testTryCount))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[Error]");
    }
}
