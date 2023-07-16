package Domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class TryCountTest {

    @DisplayName("시도할 횟수를 0회로 작성하면 예외가 발생한다.")
    @Test
    public void tryCountRangeTest() {
        // given
        final String testTryCount = "0";

        // when
        // then
        assertThatThrownBy(() -> new TryCount(testTryCount))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[Error]");
    }

    @DisplayName("시도할 횟수를 숫자로 입력하지 않으면 예외가 발생한다.")
    @ValueSource(strings = {"three", "", "세번"})
    @ParameterizedTest
    public void tryCountFormatTest(String testTryCount) {
        // given
        // when
        // then
        assertThatThrownBy(() -> new TryCount(testTryCount))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[Error]");
    }
}
