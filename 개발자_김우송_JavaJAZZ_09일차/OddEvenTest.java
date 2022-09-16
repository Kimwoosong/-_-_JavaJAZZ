import java.util.Scanner;

public class OddEvenTest {
    public static void main(String[] args) {
        int i = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        i = in.nextInt();
        if (i % 2 == 0)
            System.out.print("짝수입니다.");
        else
            System.out.print("홀수입니다.");
    }
}
