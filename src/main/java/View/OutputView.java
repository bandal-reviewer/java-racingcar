package View;

import Domain.Car;
import Domain.Cars;

import java.util.List;

public class OutputView {
    private static final String OUTPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)";
    private static final String OUTPUT_TRY_COUNT = "시도할 회수는 몇회인가요?";

    private static final String OUTPUT_RESULT_UI = "\n실행 결과";
    private static final String OUTPUT_WINNER_UI = "최종 우승자: ";
    private static final String RESULT_SYMBOL = "-";

    public void outputExceptionMessage(String exceptionMessage) {
        System.out.println(exceptionMessage);
    }

    public void outputCarNames() {
        System.out.println(OUTPUT_CAR_NAME);
    }

    public void outputTryCount() {
        System.out.println(OUTPUT_TRY_COUNT);
    }

    public void outputResultUI() {
        System.out.println(OUTPUT_RESULT_UI);
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

    public void outputWinner(List<Car> winner) {
        System.out.print(OUTPUT_WINNER_UI);
        for (Car car : winner) {
            System.out.print(car.name + " ");
        }
    }
}
