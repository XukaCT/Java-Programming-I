
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0;
        int min=1000;
        int c=0;
        ArrayList<Integer> list = new ArrayList(); 
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input==9999){
                break;
            }
            list.add(input);
            a= list.size();
        }
        System.out.println("");
        for(int i=0;i<a;i++){
            if(min>=list.get(i)){
                min = list.get(i);
            }
        }
        System.out.println("Smallest number: "+min);
        for(int i=0;i<a;i++){
            if(min==list.get(i)){
                System.out.println("Found at index: "+(i));
            }
        }
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
