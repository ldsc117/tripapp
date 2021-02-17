package TripPlanner.locations;

public class Coordinate {

    private int x;
    private int y;

    public Coordinate(int x,int y){
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getDistance(Coordinate position){
        double distance = Math.sqrt(Math.pow(this.x- position.getX(),2)  +
                Math.pow(this.y - position.getY(),2));

        return distance;
    }
}
