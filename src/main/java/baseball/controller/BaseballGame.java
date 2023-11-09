package baseball.controller;

import baseball.model.Computer;
import java.io.IOException;
import java.util.HashMap;
import view.InputView;

public class BaseballGame {

    private final InputView inputView;
    private Computer computer;

    public BaseballGame() {
        this.inputView = new InputView();
        this.computer = new Computer();
    }

    public void play() throws IOException {

        while (true) {
            HashMap<Integer, Integer> answer = computer.getAnswer();

            while (true) {
                String userNumber = inputView.validationNumber();
                if (computer.validationStrikeAndBall(answer, userNumber)) {
                    break;
                }
            }

            if (inputView.isExit()) {
                return;
            }
            computer = computer.newGame();
        }
    }
}
