package Controller;

import Domain.Cars;
import Domain.TryCount;
import Domain.Winner;
import View.InputView;
import View.OutputView;

public class RaceController {
    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    public void run() {
        try {
            startRacing();
        } catch (Exception exception) {
            outputView.outputExceptionMessage(exception.getMessage());
        }
    }

    private void startRacing() {
        Cars cars = getCars();
        int tryCount = getTryCount();
        printResult(cars, tryCount);
    }

    private Cars getCars() {
        outputView.outputCarNames();
        return new Cars(inputView.inputCarNames());
    }

    private int getTryCount() {
        outputView.outputTryCount();
        return new TryCount(inputView.inputTryCount()).getCount();
    }

    private void printResult(Cars cars, int tryCount) {
        outputView.outputResultUI();
        for (int i = 0; i < tryCount; i++) {
            cars.moveAll();
            outputView.outputResult(cars);
        }
        outputView.outputWinner(getWinner(cars));
    }

    private Winner getWinner(Cars cars) {
        return new Winner(cars.getCars());
    }
}
