/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sangn
 */
import java.util.ArrayList;
import java.util.Random;
public class JokeManager {
    private ArrayList<String> Storage;
    
    public JokeManager(){
        this.Storage = new ArrayList<>();
    }
    public void addJoke(String joke){
        Storage.add(joke);
    }
    public String drawJoke(){
        if(Storage.isEmpty()){
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        int index = draw.nextInt(Storage.size());
        return Storage.get(index);
    }
    public void printJokes(){
        System.out.println("Printing the jokes.");
        for(String print : Storage){
            System.out.println(print);
        }
    }
            
}
