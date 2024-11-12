
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        UserInterface t = new UserInterface(new Scanner(System.in), new BirdManager());
        t.start();
    }
}
