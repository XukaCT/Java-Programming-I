import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
       
    }

     public static void removeLast (ArrayList<String> list) {

        if (!list.isEmpty()) {

            int last = list.size() - 1;

            list.remove(last);

        }

    } 
}
