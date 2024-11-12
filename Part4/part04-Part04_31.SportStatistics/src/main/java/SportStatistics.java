
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int win = 0;
        int lose = 0;
        System.out.println("File: ");
        String search = scan.nextLine();
        ArrayList <String> team1 = new ArrayList<>();
        ArrayList <String> team2 = new ArrayList<>();
        ArrayList <Integer> score1 = new ArrayList<>();
        ArrayList <Integer> score2 = new ArrayList<>();
        try(Scanner game = new Scanner(Paths.get(search))){
            while(game.hasNextLine()){
                String print = game.nextLine();
                String[] row = print.split(",");
                team1.add(row[0]);
                team2.add(row[1]);
                score1.add(Integer.valueOf(row[2]));
                score2.add(Integer.valueOf(row[3]));
                
            }
        }catch(Exception e){
            System.out.println("Error");
        }
        System.out.println("Team: ");
        String team = scan.nextLine();
        for(int a=0; a< team1.size();a++){
            if(team1.get(a).equals(team)){
                count++;
                if(score1.get(a)> score2.get(a)){
                    win++;
                }else{
                    lose++;
                }
            }
        }
        for(int a=0; a< team2.size();a++){
            if(team2.get(a).equals(team)){
                count++;
                if(score1.get(a)< score2.get(a)){
                    win++;
                }else{
                    lose++;
                }
            }
        }
        
        System.out.println("Games: "+count);
        System.out.println("Wins: "+win);
        System.out.println("Losses: "+lose);
    }

}
