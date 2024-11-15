
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);
            String input = scan.nextLine();
            if(input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount =0;
            amount = Integer.parseInt(parts[1]);
            if(command.equals("add")){
                container1.add(amount);
            }
            while(command.equals("move")){
                if(container1.contains()==0){
                    break;
                }
                if(amount > container1.contains()){
                    container2.add(container1.contains());
                    container1.remove(amount);
                }else{
                    container1.remove(amount);
                    container2.add(amount);;
                }
                break;
            }
            if(command.equals("remove")){
                container2.remove(amount);
            }

        }
    }

}
