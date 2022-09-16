import java.util.Scanner;

public class ThreeTest {
    public static void main(String[] args) {
        int a, s = 0;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("양의 정수를 입력하세요 : ");
            a = in.nextInt();
            if (a % 2 == 0)
                s += a;
        } while (a > 0);
        System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + s);
    }
}
