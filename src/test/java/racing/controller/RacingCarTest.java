package racing.controller;

import org.junit.jupiter.api.Test;
import racing.view.InputView;

import java.util.Scanner;

public class RacingCarTest {

    public static void main (String[] args) {
        InputView inputView = new InputView();
        int carCnt = inputView.inputCarCnt();
        int moveCnt = inputView.inputMoveCnt();
    }
}
