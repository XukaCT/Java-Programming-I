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


public class TextUI {
    private SimpleDictionary  collect;
    private Scanner scanner;
    
    public TextUI(Scanner scanner, SimpleDictionary collect){
        this.scanner = scanner;
        this.collect = collect;
    }
    public void start(){
        while(true){
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if(input.equals("end")){             
                System.out.println("Bye bye!");
                break;
            }else if(input.equals("add")){
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                collect.add(word,translation);
            }else if(input.equals("search")){
                System.out.println("To be translated: ");
                String translate = scanner.nextLine();
                String translated = collect.translate(translate);
                if(translated == null){
                    System.out.println("Word "+translate+" was not found");
                }
                else{
                    System.out.println("Translation: "+translated);     
                }
            }else{
                System.out.println("Unknown Command");
            }      
        }        
    }
}
