package Domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WinnerTest {
    @DisplayName("우승자는 이름을 가진다.")
    @Test
    public void winnerTest1() {
        // given
        final String winnerName = "메르세데스";

        // when
        Winner winner = new Winner(winnerName);

        // then
        Assertions.assertThat(winner.name).isEqualTo(winnerName);
    }
}
