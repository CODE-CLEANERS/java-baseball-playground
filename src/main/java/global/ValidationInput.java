package global;

import java.util.HashSet;
import java.util.Set;

public class ValidationInput {

    public boolean isValidationUserNumber(String input) {
        if (!isEmpty(input) || !isValidationLength(input) || !isContainsZero(input) || !isDuplicate(
            input)) {
            return false;
        }
        return true;
    }

    public boolean isEmpty(String input) {
        if (input.isEmpty() || input.contains(" ")) {
            System.out.println("공백을 입력하였습니다.");
            return false;
        }
        return true;
    }

    public boolean isValidationLength(String input) {
        if (input.length() != 3) {
            System.out.println("3자리를 입력해 주세요.");
            return false;
        }
        return true;
    }

    public boolean isContainsZero(String input) {
        if (input.contains("0")) {
            System.out.println("1~9를 입력해 주세요.");
            return false;
        }
        return true;
    }

    public boolean isDuplicate(String input) {
        Set<Character> number = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char word = input.charAt(i);
            if (!number.add(word)) {
                System.out.println("숫자는 중복되면 안됩니다.");
                return false;
            }
        }
        return true;
    }

}


