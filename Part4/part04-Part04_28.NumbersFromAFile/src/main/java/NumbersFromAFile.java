
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        try(Scanner number = new Scanner(Paths.get(file))){
            while(number.hasNextLine()){
                int a = Integer.valueOf(number.nextLine());
                list.add(a);
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        for(int b : list){
            if(b >= lowerBound && b <= upperBound){
                count++;
            }
        }
        System.out.println("Numbers: "+count);
    }

}
