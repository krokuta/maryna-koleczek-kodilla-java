package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String args[]){
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("KTW", "XXX");
        try {
            flightFinder.findFlight(flight);
        } catch (FlightError e){
            System.out.println("No such airport in database. Error: " + e);
        } finally {
            System.out.println("Searching is over");
    }

    }
}
