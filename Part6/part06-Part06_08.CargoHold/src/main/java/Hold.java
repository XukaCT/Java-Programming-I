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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase){
        int current = this.totalWeight()+suitcase.totalWeight();
        if(maxWeight >= current){    
            suitcases.add(suitcase);
        }
    }
    public  int totalWeight(){
        int total = 0;
        for(Suitcase suitcase: suitcases){
            total = total + suitcase.totalWeight();
        }
        return total;
    }
    public void printItems(){
        for(Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }
    public String toString(){
        return suitcases.size() + " suitcases ("+this.totalWeight()+" kg)";
    }
}
