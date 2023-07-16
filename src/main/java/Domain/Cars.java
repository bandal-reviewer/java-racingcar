package Domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
    private static final String CLASSIFICATION_SYMBOL = ",";

    private final Car car = new Car();

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
            cars.add(car.from(carName.trim()));
        }
        return cars;
    }

    public List<Car> getCars() {
        return cars;
    }
}