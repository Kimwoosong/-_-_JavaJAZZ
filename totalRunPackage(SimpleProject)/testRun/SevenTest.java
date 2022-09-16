package testRun;

import java.util.Scanner;

public class SevenTest {
    public static void main(String[] args) {
        int x = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("정수를 입력해주세요 : ");
        x = in.nextInt();
        boolean b = x % 4 == 0 && x % 5 == 0;
        System.out.println(b); // 4와 5로 나누어지는지
        boolean c = x % 4 == 0 || x % 5 == 0;
        System.out.println(c); // 4또는 5로 나누어지는지
        boolean d = x % 4 == 0 | x % 5 == 0;
        System.out.println(d); // 4나 5중 하나로 나누어지지만 두 수 모두로는 나누어지지 않는지
    }
}
