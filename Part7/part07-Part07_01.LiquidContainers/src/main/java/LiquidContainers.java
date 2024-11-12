import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;  
        int second = 0; 
        
        while (true) {
            System.out.println("First: "+first + "/100");
            System.out.println("Second: "+second + "/100");
            String input = scan.nextLine();
            
            String[] parts = input.split(" ");
            String command = parts[0];
            
            if (command.equals("quit")) {
                break;
            }
            int amount =0;
            amount = Integer.parseInt(parts[1]);
            
            if (command.equals("add")) {
                if (amount > 0) {
                    first = Math.min(first + amount, 100);
                }
            } 
            else if (command.equals("remove")) {
                if (amount > 0) {
                    second = Math.max(second - amount, 0);
                }
            } 
            else if (command.equals("move")) {
                if (amount > 0) {                   
                    int moveAmount = Math.min(amount, first); 
                    first -= moveAmount;
                    second = Math.min(second + moveAmount, 100); 
                }
            }
        }
    }
}
