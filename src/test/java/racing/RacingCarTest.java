package racing;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class RacingCarTest {
    @Test
    void racingCarTest () {
        Scanner scan = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        int carCount = scan.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        int raceCount = scan.nextInt();

        System.out.println("");
        System.out.println("실행결과");
        
    }
}
