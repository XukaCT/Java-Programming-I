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
    private Scanner scanner;
    private TodoList List;
    
    public UserInterface(TodoList List,Scanner scanner){
        this.scanner = scanner;
        this.List = List;
    }
    public void start(){
        while(true){
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if(input.equals("stop")){
                break;
            }else if(input.equals("add")){
                System.out.println("To add: ");
                String todo = scanner.nextLine();
                List.add(todo);
            }else if(input.equals("remove")){
                System.out.println("Which one is removed? ");
                int a = Integer.valueOf(scanner.nextLine());
                List.remove(a);
            }else if(input.equals("list")){
                List.print();
                } 
            else{
                System.out.println("Unknown Command");
                }
        }
    }
}
