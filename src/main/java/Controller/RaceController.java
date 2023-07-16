package Controller;

import View.InputView;
import View.OutputView;

public class RaceController {
    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    public void run() {
        outputView.outputCarNames();
        String carNames = inputView.inputCarNames();

        outputView.outputTryCount();
        String tryCount = inputView.inputTryCount();
    }
}
