public class LocalNumber {
    public static void main(String[] args) {
        int a = 0; // 지역변수 a선언
        double b; // 초기화하지않고 double b 변수 선언

        System.out.print(b); // 초기화 되지 않고는 사용불가
        System.out.print(a + c); // c변수는 아직 선언되지않아 사용불가
        int c = 0; // 이후 선언됨
        public double d = 0.0; // 지역변수는 public으로 지정불가

        for (int e = 0; e < 10; e++) {
            int a = 1; // 블록이 달라도 같은이름으로 다시 선언 불가
            System.out.print(e); // e변수의 값을 10번 출력
        }
    }
}
