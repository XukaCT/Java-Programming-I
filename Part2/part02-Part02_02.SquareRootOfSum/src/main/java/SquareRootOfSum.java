
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= Integer.valueOf(scanner.nextLine());
        int b= Integer.valueOf(scanner.nextLine());
        int c = a +b;
        double d = Math.sqrt(c);
        System.out.println(d);
    }
}
