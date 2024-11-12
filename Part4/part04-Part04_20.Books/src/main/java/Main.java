import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Books> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int years = Integer.valueOf(scanner.nextLine());
            list.add(new Books(title,pages,years));
        }
        System.out.println();
        System.out.println("What information will be printed? ");
        String a = scanner.nextLine();
        if(a.equals("everything")){
            for(Books books : list){
                System.out.println(books);
            }
        }
        if(a.equals("name")){
            for(Books books : list){
                System.out.println(books.getTitle());
            }
        }if(a.equals("publication year")){
            for(Books books : list){
                System.out.println(books.getYears());
            }
        }if(a.equals("pages")){
            for(Books books : list){
                System.out.println(books.getPages());
            }
        }
    }
}
