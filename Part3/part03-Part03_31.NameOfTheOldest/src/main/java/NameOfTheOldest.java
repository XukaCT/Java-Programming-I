
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        String a = null;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[]text = input.split(",");
            if(max<=Integer.valueOf(text[1])){
                max = Integer.valueOf(text[1]);
                a = text[0]; 
            }
        }
        System.out.println("Name of the oldest: "+a);
    }
}
