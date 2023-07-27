package Generator;

import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator {
    private static final int MAX_RANDOM_NUMBER_RANGE = 10;

    @Override
    public int generateNumber() {
        Random random = new Random();
        return random.nextInt(MAX_RANDOM_NUMBER_RANGE);
    }
}
