
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object compare){
        
        if(this == compare){
            return true;
        }
        if (!(compare instanceof Song)){
            return false;
        }
        
        Song songCompare = (Song) compare;
        
        if (this.artist.equals(songCompare.artist)&& 
            this.name.equals(songCompare.name)&&
            this.durationInSeconds == songCompare.durationInSeconds){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
