
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        boolean stop = false;
        Scanner scanner = new Scanner(System.in);
        while(!stop){
            String text = scanner.nextLine();
            if(text.equals("")){
                stop=true;
            }else{
                String[] split = text.split(" ");
                for(int i=0;i<split.length;i++){
                    System.out.println(split[i]);
            
                }
            }
        }
    }
}
