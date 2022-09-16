package testRun;

import java.util.Scanner;

public class ThreeTest {
    public static void main(String[] args) {
        double a, h, s = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("원기둥의 밑면 반지름은? ");
        a = in.nextDouble();
        System.out.print("원기둥의 높이는? ");
        h = in.nextDouble();
        s = a * a * h * 3.14;
        System.out.printf("원기둥의 부피는 %.1f", s);
    }
}
