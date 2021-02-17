package TripPlanner.locations;

import java.util.List;

public class UserLocation extends Location {
    private List<Coordinate> positionHistory;

    public UserLocation(Coordinate position) {
        super(position);
    }



    public void addPositionHistory(){
        positionHistory.add(this.position);
    }



}

