package Domain;

import java.util.Random;

public class RandomNumber {
    public int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
