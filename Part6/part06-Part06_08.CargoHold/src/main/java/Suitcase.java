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
public class Suitcase {
    private ArrayList<Item> suitcase;
    private int count = 0;
    private int max;
    
    public Suitcase(int max){
        this.suitcase = new ArrayList<>();
        this.max = max;
    }
    public void addItem(Item item){
        if(item.getWeight()<= max && this.totalWeight()+item.getWeight()<= max){
            suitcase.add(item);
            count++;
        }
    }
    public String toString(){
        if(suitcase.size() == 0){
            return "no items (0 kg)"; 
        }
        if(suitcase.size() == 1){
            return "1 item ("+this.totalWeight()+" kg)";
        }
        return count+" items ("+this.totalWeight()+" kg)";
    }
    public void printItems(){
        for(Item item : suitcase){
            System.out.println(item);
        }   
    }
    public int totalWeight(){
        int total = 0;
        for(Item item:suitcase){
            total += item.getWeight();
        }
        return total;
    }
    public Item heaviestItem(){
        if(suitcase.isEmpty()){
            return null;
        }
        Item heaviest = suitcase.get(0);
        for(Item item : suitcase){
            if(heaviest.getWeight() <= item.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }
    
}
