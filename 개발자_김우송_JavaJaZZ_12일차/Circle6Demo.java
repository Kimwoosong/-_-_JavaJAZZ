class Cr {
    double radius;
    static int numOfCircles = 0;
    int numCircles = 0;

    public Cr(double radius) {
        this.radius = radius;
        numOfCircles++;
        numCircles++;
    }
}

public class Circle6Demo {
    public static void main(String[] args) {
        Cr myCircle = new Cr(10.0);
        Cr yourCircle = new Cr(5.0);

        // print(); -> main()메서드는 정적 메서드 이므로 인스턴스 메서드를 호출할 수 없다.
        System.out.println("원의 개수 : " + Cr.numOfCircles);
        System.out.println("원의 개수 : " + yourCircle.numCircles);
    }

    void print() {
        System.out.println("인스턴스 메서드입니다.");
    }

}
