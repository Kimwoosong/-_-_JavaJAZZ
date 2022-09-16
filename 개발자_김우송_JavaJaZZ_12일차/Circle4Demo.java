/*
 * Coding by kimwoosong
 */
class Circlec { // Circle 클래스 선언
    double radius; // radius 필드 변수 선언
    String color; // color 필드 변수 선언

    public Circlec(double r, String c) {
        radius = r;
        color = c;
    }

    public Circlec(double r) {
        radius = r;
        color = "파랑";
    }

    public Circlec(String c) {
        radius = 10.0;
        color = c;
    }

    public Circlec() {
        radius = 10.0;
        color = "빨강";
    }

}

public class Circle4Demo {
    public static void main(String[] args) {

        Circlec c1 = new Circlec(10.0, "빨강");
        Circlec c2 = new Circlec(5.0);
        Circlec c3 = new Circlec("노랑");
        Circlec c4 = new Circlec();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
