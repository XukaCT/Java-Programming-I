
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }else{
                String[] text = input.split("\\s+");
                System.out.println(text[(text.length)-1]);
            }
        }

    }
}
