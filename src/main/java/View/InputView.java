package View;

import java.util.Scanner;

public class InputView {
    private static final String CLASSIFICATION_SYMBOL = ",";
    Scanner scanner = new Scanner(System.in);
    public String[] inputCarNames() {
        return scanner.nextLine().split(CLASSIFICATION_SYMBOL);
    }
}
