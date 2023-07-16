package Domain;

public class Car {
    private static final int MAX_CAR_NAME_LENGTH = 5;
    private static final int MIN_CAR_NAME_LENGTH = 1;
    private static final int CAR_MOVE_LENGTH = 1;
    private static final int MIN_RANDOM_NUMBER = 4;

    public final String name;
    public int position;

    public Car(String name) {
        validateCarNameLength(name);
        this.name = name;
        this.position = 0;
    }

    public void validateCarNameLength(String name) {
        int nameLength = name.length();
        if (nameLength > MAX_CAR_NAME_LENGTH
                || nameLength < MIN_CAR_NAME_LENGTH)
            throw new IllegalArgumentException("[Error] 자동차 이름은 5자를 초과할 수 없습니다.");
    }

    public void move(int randomNumber) {
        if (randomNumber >= MIN_RANDOM_NUMBER)
            this.position += CAR_MOVE_LENGTH;
    }

    public int getPosition() {
        return position;
    }
}
