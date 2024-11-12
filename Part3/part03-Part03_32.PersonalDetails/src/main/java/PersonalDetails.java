
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = null;
        int sum = 0;
        int max = 0;
        int count = 0;
        double avg = 0;
        int a=0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] text = input.split(",");
            String word = text[0];
            a = word.length();
            sum += Integer.valueOf(text[1]);
            count++;
            if(max< a){
                max = a;
                name = text[0];
            }
        }
        avg = sum*1.0/count;
        System.out.println("Longest name: "+name);
        System.out.println("Average of the birth years: "+avg);
    }
}
