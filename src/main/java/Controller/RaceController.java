package Controller;

import Domain.Cars;
import Domain.TryCount;
import View.InputView;
import View.OutputView;

public class RaceController {
    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    public void run() {
        Cars cars = getCars();
        int tryCount = getTryCount();

    }

    public Cars getCars() {
        outputView.outputCarNames();
        return new Cars(inputView.inputCarNames());
    }

    public int getTryCount() {
        outputView.outputTryCount();
        return new TryCount(inputView.inputTryCount()).getCount();
    }
}
