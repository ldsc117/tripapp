package TripPlanner.locations;

import TripPlanner.TripApp;

import java.util.List;
import java.util.stream.Collectors;

public class Location {
    protected Coordinate position;

    public Location(Coordinate position){
        this.position=position;
    }





    public City closestCity(TripApp tripapp){
        List<Location> locations = tripapp.getLocations().stream().filter(location -> location instanceof City && location != this).collect(Collectors.toList());
        Location minDistanceLocation = locations.get(0);

        for(Location location :locations){

            if(this.position.getDistance(location.getPosition())
                    < this.position.getDistance(minDistanceLocation.getPosition())){
                minDistanceLocation = location;
            }
        }
        return (City)minDistanceLocation;
    }


    public Coordinate getPosition() {
        return position;
    }


}
