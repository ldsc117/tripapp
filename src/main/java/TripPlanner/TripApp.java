package TripPlanner;

import TripPlanner.locations.Location;
import java.util.List;

import java.util.ArrayList;

public class TripApp {
    private List<Location> locations = new ArrayList<Location>();




    public void addLocation(Location location ){
        locations.add(location);
    }


    public List<Location> getLocations() {
        return locations;
    }

}
