
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int sum=0;
        int a= Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int b= Integer.valueOf(scanner.nextLine());
        for(int i=a;i<=b;i++){
            sum+=i;
        }
        System.out.println("The sum is: "+sum);
    }
}
