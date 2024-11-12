
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int a = 0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[]text = input.split(",");
            if(max<=Integer.valueOf(text[1])){
                max = Integer.valueOf(text[1]);
            }
        }
        System.out.println("Age of the oldest: "+max);

    }
}
