/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sangn
 */
public class Archive {
    private String identify;
    private String name;
    
    public Archive(String identify, String name){
        this.identify = identify;
        this.name = name;
    }
    public boolean equals(Object compare){
        if(this == compare){
            return true;
        }
        if(!(compare instanceof Archive)){
        return false;
        }
        Archive comparing = (Archive) compare;
        if(this.name.equals(comparing.name)&&
           this.identify.equals(comparing.identify)){
            return true;
        }else if(this.identify.equals(comparing.identify)&&
                (!(this.name.equals(comparing.name)))){
            return true;
        }
        return false;
    }
    public String toString(){
        return this.identify+": "+this.name;
    }
}
