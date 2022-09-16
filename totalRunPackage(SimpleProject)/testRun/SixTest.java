package testRun;

import java.util.Scanner;

public class SixTest {
    public static void main(String[] args) {
        double f, c = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("화씨온도를 입력해주세요 : ");
        f = in.nextDouble();
        c = (f - 32) / 1.8;
        System.out.printf("섭씨온도는 %.2f입니다.", c);
    }
}
