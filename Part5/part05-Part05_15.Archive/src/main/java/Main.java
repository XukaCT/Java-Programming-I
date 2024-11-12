
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> list = new ArrayList<>();
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String input1 = scanner.nextLine();
            if(input1.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String input2 = scanner.nextLine();
            if(input2.isEmpty()){
                break;
            }
            Archive archive = new Archive(input1, input2);
            if(!(list.contains(archive))){
                list.add(archive);
            }
            
        }
        System.out.println("");
        System.out.println("==Items==");
        for(Archive a:list){
            System.out.println(list);
        }
    }
}
