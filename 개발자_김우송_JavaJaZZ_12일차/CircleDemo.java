/*
 * Coding by 개발자 김우송
 */

class Circle { // Circle 클래스 선언
    double radius; // radius 필드 선언

    double findArea() { // findarea 생성자 선언
        return 3.14 * radius * radius; // 계산식의 결과를 리턴
    }

    void show(double x, double y) { // show 메서드 선언(변수는 2개를 입력받음)
        System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y); // 반지름과 넓이를 출력
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle myCircle = new Circle(); // Circle 클래스를 myCircle 변수로 초기화

        myCircle.radius = 10.0; // myCircle(Circle)의 radius 필드에 10.0을 대입

        myCircle.show(myCircle.radius, myCircle.findArea());
        // myCircle(Circle)의 show 메서드에 myCircle(Circle)의 radius값, myCicle(Circle)의
        // findArea()생성자의 결과값을 넣음
        // 결과는 show메서드의 printf의 결과가 나옴
    }
}