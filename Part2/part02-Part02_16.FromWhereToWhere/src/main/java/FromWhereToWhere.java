
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        System.out.println("Where from?");
        int b = Integer.valueOf(scanner.nextLine());
        int a = Integer.valueOf(scanner.nextLine());
        for(int i=a;i<=b;i++){
            System.out.println(i);
        }
        // Write your program here
    }
}
