package TripPlanner.locations;

public class City extends Location {
    private String name;


    public City(Coordinate position , String name) {
        super(position);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
