import java.util.Scanner;

public class eightTest {
    public static void main(String[] args) {
        int i, a, b, c, sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("0~999 사이의 숫자를 입력하세요 : ");
        i = in.nextInt();
        a = i % 10;
        b = (i / 10) % 10;
        c = i / 100;
        System.out.printf("첫 번째 자릿수 = %d\n", a);
        System.out.printf("두 번째 자릿수= %d\n", b);
        System.out.printf("세 번째 자릿수 =  %d\n", c);
        sum = a + b + c;
        System.out.printf("각 자릿수의 합 = %d", sum);
    }
}
