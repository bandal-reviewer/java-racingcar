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

    public void startRacing() {
        Cars cars = getCars();
        int tryCount = getTryCount();
        printResult(cars, tryCount);
    }

    public Cars getCars() {
        outputView.outputCarNames();
        return new Cars(inputView.inputCarNames());
    }

    public int getTryCount() {
        outputView.outputTryCount();
        return new TryCount(inputView.inputTryCount()).getCount();
    }

    public void printResult(Cars cars, int tryCount) {
        outputView.outputResultUI();
        for (int i = 0; i < tryCount; i++) {
            cars.moveAll();
            outputView.outputResult(cars);
        }
        outputView.outputWinner(getWinner(cars));
    }

    public Winner getWinner(Cars cars) {
        return new Winner(cars.getCars());
    }
}
