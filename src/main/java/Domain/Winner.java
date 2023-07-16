package Domain;

import java.util.List;
import java.util.stream.Collectors;

public class Winner {
    private static final int MIN_POSITION = 0;

    final List<Car> winner;
    final int maxPosition;

    public Winner(List<Car> cars) {
        this.maxPosition = getMaxPosition(cars);
        this.winner = cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());
    }

    public int getMaxPosition(List<Car> cars) {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(MIN_POSITION);
    }

    public List<String> getWinnerName() {
        return winner.stream()
                .map(Car::getName)
                .collect(Collectors.toList());
    }
}
