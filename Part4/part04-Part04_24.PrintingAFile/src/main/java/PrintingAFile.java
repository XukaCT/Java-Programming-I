
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(Paths.get("data.txt"))){    
            while(scanner.hasNextLine()){
                String print = scanner.nextLine();
                System.out.println(print);
            }
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
