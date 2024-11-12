
import java.util.HashMap;
import java.util.Map;

public class BirdManager {
    private HashMap<String, Integer> observing;
    private HashMap<String, String> translations;

    public BirdManager() {
        this.translations = new HashMap<>();
        this.observing = new HashMap<>();
    }

    public String translate(String word) {
        return this.translations.get(word);
    }

    public void Observe(String word,int Count){
        if(this.translations.containsKey(word)){
            observing.put(word,observing.get(word)+1);
        }else{
            System.out.println("Not a bird!");
        }
    }
    
    public void add(String word, String translation) {
        this.translations.put(word, translation);
        this.observing.put(word, 0);
    }
    
    public void showAlls() {
        for (Map.Entry<String, Integer> entry : observing.entrySet()) {
            System.out.println(entry.getKey() + " (" + translations.get(entry.getKey()) + "): " + entry.getValue() + " observations");
        }
    }
    
    public void showOne(String show) {
        if (observing.containsKey(show)) {
            System.out.println(show + " (" + translations.get(show) + "): " + observing.get(show) + " observations");
        } else {
            System.out.println("No observations for this bird.");
        }
    }
  
}
