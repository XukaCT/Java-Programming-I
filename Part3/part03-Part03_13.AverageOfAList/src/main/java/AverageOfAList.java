
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int sum = 0;
        double avg = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input==-1){
                break;
            }
            list.add(input);
            a = list.size();
        }
        System.out.println("");
        for(int i=0;i<a;i++){
            sum += list.get(i);
        }
        avg = sum*1.0/a;
        System.out.println("Average: "+avg);
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}