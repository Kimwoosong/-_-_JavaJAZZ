import java.util.Scanner;

public class RectangleTest {

    public static void main(String[] args) {
        double w, h, area;
        Scanner in = new Scanner(System.in);
        System.out.print("직사각형의 가로 길이를 입력하세요 : ");
        w = in.nextDouble();
        System.out.print("직사각형의 가로 길이를 입력하세요 : ");
        h = in.nextDouble();
        area = w * h;
        System.out.printf("직사각형의 넓이는 %.1f입니다.", area);

    }
}
