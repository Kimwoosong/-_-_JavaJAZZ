import java.util.Scanner;

public class nineTest {
    public static void main(String[] args) {
        int a, b, c, s = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("전공 이수 학점 : ");
        a = in.nextInt();
        System.out.print("교양 이수 학점 : ");
        b = in.nextInt();
        System.out.print("일반 이수 학점 : ");
        c = in.nextInt();
        s = a + b + c;
        if (s >= 140 && a >= 70 && ((b >= 30 && c >= 30) && (b + c >= 80 || a + b >= 80 || a + c >= 80)))
            // s는 140이상 a는 70 이상 b,c 30이상이거나 두영역이 80이상
            System.out.print("졸업 가능");
    }
}
