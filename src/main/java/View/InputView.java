package View;

import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public String inputCarNames() {
        return scanner.nextLine();
    }

    public String inputTryCount() {
        return scanner.nextLine();
    }
}
