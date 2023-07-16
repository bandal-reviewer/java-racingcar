package Domain;

public class Car {
    public final String name;

    public Car(String name) {
        validateCarNameLength(name);
        this.name = name;
    }

    public void validateCarNameLength(String name) {
        if (name.length() > 5)
            throw new IllegalArgumentException("[Error] 자동차 이름은 5자를 초과할 수 없습니다.");
    }
}
