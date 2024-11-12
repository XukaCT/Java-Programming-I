
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = 0;
        int c = 0;
        while(true){
            int a = Integer.valueOf(scanner.nextLine());
            if(a>0){
                b = b + a;
                c = c + 1;
            }
            if(a==0){
                break;
            }
        }
        if(b<=0){
            System.out.println("Cannot calculate the average");
        }
        System.out.println((b*1.0)/c);
    }
}
