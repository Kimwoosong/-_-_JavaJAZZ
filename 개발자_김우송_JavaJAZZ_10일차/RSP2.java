import java.util.Scanner;

public class RSP2 {

    public static void main(String[] args) {
        String c = input("철수");
        String y = input("영희");

        whosWin(c, y);
    }

    public static String input(String string) {
        Scanner in = new Scanner(System.in);
        System.out.print(string + " : ");
        string = in.nextLine();
        return string;
    }

    public static void whosWin(String c, String y) {

        if (c.equals("r") && y.equals("s") || c.equals("p") && y.equals("r") || c.equals("s") && y.equals("p"))
            System.out.println("철수, 승!");
        else if (y.equals("r") && c.equals("s") || y.equals("p") && c.equals("r") || y.equals("s") && c.equals("p"))
            System.out.println("영희, 승!");
        else
            System.out.println("무승부!");
    }
}
