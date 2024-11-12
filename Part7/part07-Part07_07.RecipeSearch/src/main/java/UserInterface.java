
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipeList = new ArrayList<>(); 
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
    }
    
    public void start(){
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        readFile(fileName); 
        System.out.println("");
        
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("Find cooking time - searches recipes by cooking time");
        System.out.println("Find ingredient - searches recipes by ingredient");
        
        while(true){
            System.out.println("");
            System.out.println("Enter command: ");
            String command = scanner.nextLine().toLowerCase();
            if(command.equals("stop")){
                break;
            }
            else if(command.equals("list")){
                System.out.println("");
                 System.out.println("Recipes:");
                 for(Recipe r: this.recipeList){
                     System.out.println(r);
                 }
            }
            else if(command.equals("find name")){
                System.out.println("Searched word: ");
                String SearchWord = scanner.nextLine().toLowerCase();
                for(Recipe r: this.recipeList){
                    if(r.getName().contains(SearchWord)){
                        System.out.println(r);
                    }
                }
            }
            else if(command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int searchTime = Integer.valueOf(scanner.nextLine());
                for(Recipe r: this.recipeList){
                    if(r.getTime() <= searchTime){
                        System.out.println(r);
                    }
                } 
            }
            else if(command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String searchIngredient = scanner.nextLine().toLowerCase();
                for(Recipe r: this.recipeList){
                    if(r.getIngredients().contains(searchIngredient)){
                        System.out.println(r);
                    }
                }
            }
        }
    }

    public void readFile(String fileName) {
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String name = line;
                int time = Integer.valueOf(fileReader.nextLine()); 
                ArrayList<String> things = new ArrayList();
                while(fileReader.hasNextLine()){
                    String ingredient = fileReader.nextLine();
                    if(ingredient.isEmpty()){
                        break;
                    }                    
                    things.add(ingredient);
                }
                recipeList.add(new Recipe(name, time, things));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    } 
}