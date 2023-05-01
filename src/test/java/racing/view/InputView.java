package racing.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scan = new Scanner(System.in);
    public int inputCarCnt() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return scan.nextInt();
    }

    public int inputMoveCnt(){
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scan.nextInt();
    }
}
