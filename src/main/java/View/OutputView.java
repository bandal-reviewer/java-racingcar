package View;

import Domain.Car;
import Domain.Cars;

public class OutputView {
    private static final String RESULT_SYMBOL = "-";

    public void outputExceptionMessage(String exceptionMessage) {
        System.out.println(exceptionMessage);
    }

    public void outputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
    }

    public void outputTryCount() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void outputResultUI() {
        System.out.println("실행 결과");
    }
    public void outputResult(Cars cars) {
        for (Car car : cars.getCars()) {
            outputOneResult(car);
        }
        System.out.println();
    }

    public void outputOneResult(Car car) {
        System.out.println(car.name + " : " + RESULT_SYMBOL.repeat(car.position));
    }

    public void outputWinner() {
        System.out.println("최종 우승자: ");
    }
}
