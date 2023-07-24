package Domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
    private static final String SEPARATOR = ",";

    private final List<Car> cars;

    public Cars(String carNames) {
        this.cars = generateCars(convertCarNamesToList(carNames));
    }

    private List<String> convertCarNamesToList(String carNames) {
        return new ArrayList<>(
                Arrays.asList(carNames.split(SEPARATOR))
        );
    }

    private List<Car> generateCars(List<String> carNameList) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNameList) {
            cars.add(new Car(carName.trim()));
        }
        return cars;
    }

    public void moveAll() {
        for (Car car : cars) {
            car.move(RandomNumber.generateRandomNumber());
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}