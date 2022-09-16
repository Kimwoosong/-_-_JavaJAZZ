public class ReturnDemo {
    public static void main(String[] args) {
        printScore(99);
        printScore(120); // printScore 함수에 값 120 넣기
    }

    public static void printScore(int score) {
        // 값을 받은걸로 조건문 체크
        if (score < 0 || score > 100) {
            System.out.println("잘못된 점수 : " + score);
            return;
        }
        System.out.println("점수 : " + score);
    }
}
