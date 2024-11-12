
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        int a = elements.size(); 
        String output = "The collection "+name+" ";
        String finalOutput = "";
        if(elements.isEmpty()){
            return output+"is empty.";
        }
        for(String element : elements){
            finalOutput += "\n"+element;
        }
        if(a == 1){
            return output+"has "+a+" element:"+finalOutput;
        }else{
            return output+"has "+a+" elements:"+finalOutput;
        }
    }
}
