/*
 * Coding by 개발자 김우송
 */

class Circle { // Circle 클래스 선언
    private double radius; // radius 필드 선언(외부에 보이지않게 은닉)

    public double getRadius() { // Radius의 접근자
        return radius;
    }

    public void setRadius(double r) { // Radius의 설정자
        this.radius = r;
    }

    double findArea() { // findarea 생성자 선언
        return 3.14 * radius * radius; // 계산식의 결과를 리턴
    }

    void show(double x, double y) { // show 메서드 선언(변수는 2개를 입력받음)
        System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y); // 반지름과 넓이를 출력
    }
}

public class Circle2Demo {
    public static void main(String[] args) {
        Circle myCircle = new Circle(); // Circle 클래스를 myCircle 변수로 초기화

        myCircle.setRadius(10.0);
        // myCircle(Circle)의 접근자 getRadius에 10.0을 대입 ( 은닉되어있는 radius에 값이 넣어짐)

        myCircle.show(myCircle.getRadius(), myCircle.findArea());
        // myCircle(Circle)의 show 메서드에 myCircle(Circle)의 설정자 getRadius값을 불러서 넣음
        // myCicle(Circle)의 findArea()생성자의 결과값을 넣음
        // 결과는 show메서드의 printf의 결과가 나옴
    }
}