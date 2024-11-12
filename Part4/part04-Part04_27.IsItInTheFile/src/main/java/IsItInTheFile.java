
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
public class IsItInTheFile {

    public static void main(String[] args) {
        boolean stop = false;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(); 
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try (Scanner find = new Scanner(Paths.get(file))){
            while(find.hasNextLine()){
                String a = find.nextLine();
                list.add(a);
            }
        }catch(Exception e){
            System.out.println("Reading the file "+e.getMessage()+" failed.");
            stop = true;
        }
        while(!stop){
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();
            if(list.contains(searchedFor)){
                System.out.println("Found!");
                stop = true;
            }else{
                System.out.println("Not found.");
                stop = true;
            }
        }
    }
}
