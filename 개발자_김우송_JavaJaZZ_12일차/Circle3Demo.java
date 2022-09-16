class Circle {
    private double radius;

    public Circle(double r) {
        radius = r;
    }
}

public class Circle3Demo {
    public static void main(String[] args) {
        Circle myCircle = new Circle(10.0);
        // Circle yourCircle = new Circle(); -> 디폴트 생성자가 없어서 사용 불가
    }
}
