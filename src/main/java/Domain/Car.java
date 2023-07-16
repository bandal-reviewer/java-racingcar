package Domain;

public class Car {
    private static final int MAX_CAR_NAME_LENGTH = 5;
    private static final int MIN_CAR_NAME_LENGTH = 1;
    public final String name;

    public Car(String name) {
        validateCarNameLength(name);
        this.name = name;
    }

    public void validateCarNameLength(String name) {
        int nameLength = name.length();
        if (nameLength > MAX_CAR_NAME_LENGTH
                || nameLength < MIN_CAR_NAME_LENGTH)
            throw new IllegalArgumentException("[Error] 자동차 이름은 5자를 초과할 수 없습니다.");
    }
}
