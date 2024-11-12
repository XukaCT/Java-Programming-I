
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = 0;
        int c = 0;
        while(true){
            System.out.println("Give a number:");
            int a = Integer.valueOf(scanner.nextLine());
            if(a!=0){
                b = b + a;
                c = c + 1;
            }
            if(a==0){
                break;
            }
        }
        System.out.println("Average of the numbers: "+(b*1.0)/c);
    }
}
