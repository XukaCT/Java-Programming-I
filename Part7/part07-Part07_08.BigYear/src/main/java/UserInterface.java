/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sangn
 */
import java.util.Scanner;


public class UserInterface {
    private BirdManager  collect;
    private Scanner scanner;
    
    public UserInterface(Scanner scanner, BirdManager collect){
        this.scanner = scanner;
        this.collect = collect;
    }
    public void start(){
        while(true){
            System.out.print("? ");
            String input = scanner.nextLine();
            if (input.equals("Quit")) {
                break;
            }
             if (input.equals("Add")) {
                System.out.print("Name: ");
                String bird = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String LatinName = scanner.nextLine();
                collect.add(bird, LatinName);
            } else if (input.equals("Observation")) {
                 System.out.print("Bird? ");
                 String look = scanner.nextLine();
                collect.Observe(look, 0);
            } else if (input.equals("All")) {
                collect.showAlls();
            } else if (input.equals("One")) {
                 System.out.print("Bird? ");
                 String show = scanner.nextLine();
                collect.showOne(show);        
            }  
        }
    }
}
