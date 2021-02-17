package TripPlanner.locations;

public class Landmark extends Location {

    private String name;
    private int fee;



    public Landmark(Coordinate position , String name , int fee) {
        super(position);
        this.fee = fee;
        this.name = name;
    }


    public void setFee(int fee) {
        if(fee >0){
        this.fee = fee;}
        else{
            throw new IllegalArgumentException("Value is negative ,Please enter positive value");
        }
    }

    public String getName() {
        return name;
    }
}
