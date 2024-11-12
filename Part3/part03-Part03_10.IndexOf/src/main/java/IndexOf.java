
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0;
        int c=0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
            a=list.size();
        }

        System.out.println("");
        System.out.println("Search for? ");
        int b = Integer.valueOf(scanner.nextLine());
        for(int i=0;i<a;i++){
            if(b==list.get(i)){
                System.out.println(b+" is at index "+i);
            }
        }
        

        // implement here finding the indices of a number
    }
}
