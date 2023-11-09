import baseball.controller.BaseballGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Application {
    public static void main(String[]args) throws IOException {
        BaseballGame game = new BaseballGame();
        game.play();
    }
}
