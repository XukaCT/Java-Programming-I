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

public class Package {
    private ArrayList<Gift> gift;
    
    public Package(){
        this.gift = new ArrayList<>();
    }
    public void addGift(Gift addGift){
        this.gift.add(addGift);
    }
    public int totalWeight(){
        int total=0;       
        for(Gift a : gift){
            total += a.getWeight();
        }
        return total;
    }
}
