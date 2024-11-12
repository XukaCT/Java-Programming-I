
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =0;
        int b =0;
        int c=0;
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for? ");
        String abc = scanner.nextLine();
        for(String string:list){
            while(true){
                if(list.contains(abc)){
                    System.out.println(abc+" was found!");
                    break;
                }
                System.out.println(abc+" was not found!");
                break;
            }
        }
        
    }
}
