
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        try(Scanner list = new Scanner(Paths.get(fileName))){
            while(list.hasNextLine()){
                String next = list.nextLine();
                String[] row = next.split(",");
                String a = row[0];
                int b = Integer.valueOf(row[1]);
                System.out.println(a+", age: "+b+" years");
            }
        }catch(Exception e){
        System.out.println("Error: "+ e.getMessage());
        }
    }
}
