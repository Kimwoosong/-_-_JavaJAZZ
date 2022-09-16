import java.util.Scanner;

public class twoTest {
    public static void main(String[] args) {
        int i, s = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        i = in.nextInt();
        s = i * i;
        System.out.printf("%d의 제곱은 %d", i, s);
    }
}
