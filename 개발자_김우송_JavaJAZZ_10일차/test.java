public class test {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                continue;
            }
            sum += i;
        }
        System.out.println(sum);

        int total = 0, x = 0, y;

        while (++x < 5) {
            y = x * x;
            System.out.println(y);
            total += y;
        }
        System.out.println("총합은 " + total);
    }
}
