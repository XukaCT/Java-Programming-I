
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String a = scanner.nextLine();
        try(Scanner search = new Scanner(Paths.get(a))){
            while(search.hasNextLine()){
                String print = search.nextLine();
                System.out.println(print);
            }
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
