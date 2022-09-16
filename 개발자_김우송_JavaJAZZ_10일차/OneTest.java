import java.util.Scanner;

public class OneTest {
    public static void main(String[] args) {
        int a = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("성년 미성년 체크입니다.");
        System.out.print("나이를 입력하세요 : ");
        a = in.nextInt();
        if (a >= 19)
            System.out.println("성년입니다.");
        else
            System.out.println("미성년입니다.");
    }
}
