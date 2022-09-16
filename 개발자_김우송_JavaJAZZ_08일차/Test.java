public class Test {
    public static void main(String[] args) {
        System.out.println("THERE ARE NO DUMB QUESTIONS");

        int roop = 6;
        for (int i = 0; i < roop; i++) {
            // for (int j = roop - 1; j > i; j--) {
            // System.out.printf(" ");
            // }

            // for (int j = 0; j < 2 * i + 1; j++) {
            // System.out.printf("*");
            // }

            for (int j = 0; j < i * 2 + 1; j++) {
                if (j < roop - i)
                    System.out.print(" ");
                else if (j < roop / 2 + i)
                    System.out.print("*");

            }
            System.out.println("");
        }
    }
}
