package view;

import global.ValidationInput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private final ValidationInput validationInput;

    public InputView() {
        validationInput = new ValidationInput();
    }

    public String getUserNumber() throws IOException {
        System.out.print("숫자를 입력해 주세요 : ");
        return in.readLine();
    }

    public boolean isExit() throws IOException {
        while (true) {
            System.out.println("게임을 계속하시려면 1, 종료하시려면 2를 입력해주세요");
            String input = in.readLine();
            String CONTINUE = "1";
            String EXIT = "2";
            if (input.equals(EXIT)) {
                return true;
            }
            if (input.equals(CONTINUE)) {
                return false;
            }
        }
    }

    public String validationNumber() throws IOException {
        String input;

        do {
            input = getUserNumber();
        } while (!validationInput.isValidationUserNumber(input));

        return input;
    }
}
