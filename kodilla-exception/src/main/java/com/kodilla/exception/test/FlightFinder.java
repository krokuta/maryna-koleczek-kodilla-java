package com.kodilla.exception.test;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FlightFinder {
    public boolean findFlight(Flight flight) throws FlightError{
        HashMap<String, Boolean> flightMap = new HashMap<String, Boolean>();
        Flight flight1 = new Flight("KTW", "KRK");
        Flight flight2 = new Flight("KTW", "BARC");
        Flight flight3 = new Flight("KTW", "LON");
        flightMap.put(flight1.getArrivalAirport(), true);
        flightMap.put(flight2.getArrivalAirport(), false);
        flightMap.put(flight3.getArrivalAirport(), true);
        if(!flightMap.containsKey(flight.getArrivalAirport())){
            throw new FlightError("error message");
        }
        boolean result = flightMap.get(flight.getArrivalAirport());
        return result;
    }
}
