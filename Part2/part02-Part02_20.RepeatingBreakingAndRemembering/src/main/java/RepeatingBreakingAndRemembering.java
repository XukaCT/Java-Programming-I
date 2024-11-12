
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        int sum=0;
        int number=0;
        int odd=0;
        int even=0;
        System.out.println("Give a numbers:");
        while(true){
            int a=Integer.valueOf(scanner.nextLine());
            if(a == -1){
                break;
            }
            sum+=a;
            number+=1;
            if(a%2==0){
                even+=1;
            }
            if(a%2!=0){
                odd+=1;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+number);
        System.out.println("Average: "+(sum*1.0)/number);
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
