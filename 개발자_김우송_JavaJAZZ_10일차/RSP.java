import java.util.Scanner;

public class RSP {
    public static void main(String[] args) {
        String c, y;
        Scanner in = new Scanner(System.in);
        System.out.print("철수 : ");
        c = in.nextLine();
        System.out.print("영희 : ");
        y = in.nextLine();

        if (c.equals("r") && y.equals("s") || c.equals("p") && y.equals("r") || c.equals("s") && y.equals("p"))
            System.out.println("철수, 승!");
        else if (y.equals("r") && c.equals("s") || y.equals("p") && c.equals("r") || y.equals("s") && c.equals("p"))
            System.out.println("영희, 승!");
        else
            System.out.println("무승부!");

    }
}
