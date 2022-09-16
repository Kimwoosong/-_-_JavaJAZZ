class Circle {
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this(radius, "파랑");
    }

    public Circle(String color) {
        this(10.0, color);
    }

    public Circle() {
        this(10.0, "빨강");
    }
}

public class Circle5Demo {
    public static void main(String[] args) {

        Circle c1 = new Circle(10.0, "빨강");
        Circle c2 = new Circle(5.0);
        Circle c3 = new Circle("노랑");
        Circle c4 = new Circle();
    }
}
