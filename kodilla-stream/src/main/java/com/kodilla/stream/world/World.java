package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    public List<Continent> listOfContinents = new ArrayList<>();

    public void addContinent(Continent continent){
        listOfContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return listOfContinents.stream()
                .flatMap(unit -> unit.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
