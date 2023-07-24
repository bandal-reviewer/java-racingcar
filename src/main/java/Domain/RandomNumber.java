package Domain;

import java.util.Random;

public class RandomNumber {
    private static final int MAX_RANDOM_NUMBER_RANGE = 10;

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_RANDOM_NUMBER_RANGE);
    }
}
