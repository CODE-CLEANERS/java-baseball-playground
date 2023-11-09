package baseball.model;

import java.util.HashMap;
import java.util.Random;

public class Computer {

    private final HashMap<Integer, Integer> answer;

    public Computer() {
        this.answer = createAnswer();
    }

    public Computer newGame() {
        return new Computer();
    }

    public HashMap<Integer, Integer> createAnswer() {
        HashMap<Integer, Integer> answer = new HashMap<>();

        int NUMBER_SPACE_SIZE = 3;

        while (answer.size() < NUMBER_SPACE_SIZE) {
            int randomNumber = getRandomNumber();
            if (answer.containsKey(randomNumber)) {
                continue;
            }
            answer.put(randomNumber, answer.size() + 1);
        }

        return answer;
    }

    public int[] calculationStrikeAndBall(HashMap<Integer, Integer> answer, String userNumber) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < userNumber.length(); i++) {
            int digit = Character.getNumericValue(userNumber.charAt(i));
            Integer answerValue = answer.get(digit);

            if (answerValue != null) {
                if (answerValue.equals(i + 1)) {
                    strike++;
                } else {
                    ball++;
                }
            }
        }
        return new int[]{strike, ball};
    }

    public boolean validationStrikeAndBall(HashMap<Integer, Integer> answer, String userNumber) {
        int[] strikeAndBall = calculationStrikeAndBall(answer, userNumber);
        int strike = strikeAndBall[0];
        int ball = strikeAndBall[1];

        if (strike == 3) {
            System.out.println("정답입니다.");
        }

        if (strike == 0 && ball == 0) {
            System.out.println("낫씽");
        }

        if (strike > 0 && ball == 0) {
            System.out.printf("%s 스트라이크%s", strike, System.lineSeparator());
        }

        if (strike == 0 && ball > 0) {
            System.out.printf("%s 볼%s", ball, System.lineSeparator());
        }

        if (strike > 0 && ball > 0) {
            System.out.printf("%s 스트라이크, %s 볼%s", strike, ball, System.lineSeparator());
        }

        return strike == 3;
    }

    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }

    public HashMap<Integer, Integer> getAnswer() {
        return answer;
    }
}

