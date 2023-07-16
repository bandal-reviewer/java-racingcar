package Domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Car {
    private static final int MAX_CAR_NAME_LENGTH = 5;
    private static final int MIN_CAR_NAME_LENGTH = 1;
    private static final int CAR_MOVE_LENGTH = 1;
    private static final int MIN_RANDOM_NUMBER = 4;

    private final Map<String, Car> carCache = new HashMap<>();

    public String name;
    public int position;

    public Car() {
    }

    private Car(String name) {
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

    public Car from(String name) {
        if (carCache.containsKey(name))
            return carCache.get(name);
        else {
            Car car = new Car(name);
            carCache.put(name, car);
            return car;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(this.name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
