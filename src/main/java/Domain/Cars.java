package Domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
    private static final String CLASSIFICATION_SYMBOL = ",";

    private final RandomNumber randomNumber = new RandomNumber();

    private final List<Car> cars;

    public Cars(String carNames) {
        this.cars = generateCars(convertCarNamesToList(carNames));
    }

    public List<String> convertCarNamesToList(String carNames) {
        return new ArrayList<>(
                Arrays.asList(carNames.split(CLASSIFICATION_SYMBOL))
        );
    }

    public List<Car> generateCars(List<String> carNameList) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNameList) {
            cars.add(new Car(carName.trim()));
        }
        return cars;
    }

    public void reportOneResult() {
        for (Car car : cars) {
            car.move(randomNumber.generateRandomNumber());
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}