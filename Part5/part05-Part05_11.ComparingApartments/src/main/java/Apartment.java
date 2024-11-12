
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment apartment){
        if(this.rooms > apartment.rooms){
            return true;
        }
        if(this.rooms < apartment.rooms){
            return false;
        }
        if(this.squares > apartment.squares){
            return true;
        }
        if(this.squares > apartment.squares){
            return false;
        }
        if(this.pricePerSquare > apartment.pricePerSquare){
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment compared){
        if(((compared.squares * compared.pricePerSquare)-(this.squares * this.pricePerSquare))>0){
            return ((compared.squares * compared.pricePerSquare)-(this.squares * this.pricePerSquare));
        }else{
            return ((-1)*((compared.squares * compared.pricePerSquare)-(this.squares * this.pricePerSquare)));
        }
    }
    public boolean moreExpensiveThan(Apartment compared){
        if(((compared.squares * compared.pricePerSquare)-(this.squares * this.pricePerSquare))>0){
            return false;
        }else{
            return true;
        }
    }
}
