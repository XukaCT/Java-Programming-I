/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sangn
 */
public class Books {
    private String name;
    private int pages;
    private int years;
    
    public Books(String name,int pages, int years){
        this.name = name;
        this.pages = pages;
        this.years = years;
    }
    public String getTitle(){
        return this.name;
    }
    public int getPages(){
        return this.pages;
    }
    public int getYears(){
        return this.years;
    }
    public String toString(){
        return this.name+", "+this.pages+ " pages"+", "+this.years;
    }
}
