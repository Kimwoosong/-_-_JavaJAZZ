package testRun;

public class While2Demo {
    public static void main(String[] args) {
        int row = 2;
        while (row < 19) {
            int column = 1;
            while (column < 19) {
                System.out.printf("%2d * %2d = %2d\t", row, column, row * column);
                column++;
            }
            System.out.println();
            row++;
        }
    }
}