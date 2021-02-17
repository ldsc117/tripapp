package TripPlanner;


import TripPlanner.locations.*;

public class Main {

    public static void main(String args[]){
        TripApp tripApp= new TripApp();

        Landmark transfagarasan = new Landmark(new Coordinate(2,2),"Transfagarasan",20);

        City ploiesti = new City(new Coordinate(5,5),"Ploiesti");

        tripApp.addLocation(new City(new Coordinate(0,0) , "Bucharest"));
        tripApp.addLocation(new Landmark(new Coordinate(1,0) , "Bucegi", 20));
        tripApp.addLocation(new UserLocation(new Coordinate(0,0)));
        tripApp.addLocation(new City(new Coordinate(1,1) , "Constanta"));
        tripApp.addLocation(new City(new Coordinate(1,2) , "Buzau"));
        tripApp.addLocation(transfagarasan);
        tripApp.addLocation(ploiesti);


        System.out.println(transfagarasan.closestCity(tripApp).getName());
        System.out.println(ploiesti.closestCity(tripApp).getName());



    }
}



