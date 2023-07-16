package Domain;

import java.util.LinkedHashMap;
import java.util.Map;

public class Result {
    final LinkedHashMap<Car, Integer> result = new LinkedHashMap<>();

    public Result(Cars cars) {
        generateResult(cars);
    }

    public void generateResult(Cars cars) {
        for (Car car : cars.getCars()) {
            car.move(RandomNumber.generateRandomNumber());
            result.put(car, car.position);
        }
    }

    public Map<Car, Integer> getResult() {
        return result;
    }
}
