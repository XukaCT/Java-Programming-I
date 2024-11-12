
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0;
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
            a = numbers.size();
        }
        System.out.println("From where? ");
        int b=Integer.valueOf(scanner.nextLine());
        System.out.println("To where? ");
        int c=Integer.valueOf(scanner.nextLine());
        for(int i=b;i<=c;i++){
            System.out.println(numbers.get(i));
        }
    }
}
