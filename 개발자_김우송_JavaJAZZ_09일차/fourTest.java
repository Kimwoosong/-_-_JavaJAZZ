import java.util.Scanner;

public class fourTest {
    public static void main(String[] args) {
        int s, m, h = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("초 단위 정수를 입력하세요 : ");
        s = in.nextInt();

        m = s / 60;
        h = m / 60;
        s = s % 60;
        m = m % 60;

        System.out.printf("%01d시간 %02d분 %02d초", h, m, s);
    }
}
