public class VarDemo {
    // var a = 1; -> var는 메서드 내부에서만 사용 가능

    public static void main(String[] args) {
        int var = 1; // var를 변수 이름으로 사용 가능

        var x = 1;

        System.out.println(x);

        // var x = 1, y = 3, z = 4; -> var를 사용하여 다수의 변수를 하나의 실행문으로 초기화할 수 없다.

        // var str = null; -> var변수에 null을 대입할 수 없다.

        // var oops;
        // oops = 1; -> var변수를 바로 초기화하지 않으면 타입을 추론할 수 없다.

    }

    // void test(var x ){ } -> 변수 x의 타입을 추론할 수 없다.
}
