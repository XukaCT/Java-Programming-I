
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = 0;
        while(true){
            System.out.println("Give a number:");
            int a = Integer.valueOf(scanner.nextLine());
            if(a!=0){
                b = b + a;
            }
            if(a==0){
                break;
            }
        }
        System.out.println("Sum of the numbers: "+b);
    }
}
