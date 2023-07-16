package View;

import Domain.Car;
import Domain.Result;
import Domain.Results;

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

    public void outputResult(Results results) {
        System.out.println("실행 결과");
        for (Result result : results.getResults()) {
            outputOneCarResult(result);
            System.out.println();
        }
        System.out.println("최종 우승자: ");
    }

    public void outputOneCarResult(Result result) {
        for (Car car : result.getResult().keySet()) {
            System.out.println(car.name + " : " + RESULT_SYMBOL.repeat(result.getResult().get(car)));
        }
    }
}
