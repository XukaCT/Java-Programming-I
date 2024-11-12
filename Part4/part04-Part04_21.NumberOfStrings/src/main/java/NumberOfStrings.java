
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        while (true) {
            String line = scanner.nextLine();
            count++;
            if (line.equals("end")) {
            break;
            }
        }
        System.out.println(count-1);
    }
}
