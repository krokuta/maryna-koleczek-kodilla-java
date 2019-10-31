package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        BigDecimal sokoviaPeople = new BigDecimal("11111111");
        BigDecimal wakandaPeople = new BigDecimal("88888888");
        BigDecimal middleEarthPeople = new BigDecimal("22222222");
        BigDecimal mordorPeople = new BigDecimal("66666666");
        BigDecimal tatooinePeople = new BigDecimal("33333333");
        BigDecimal coruscantPeople = new BigDecimal("44444444");
        Country sokovia = new Country(sokoviaPeople);
        Country wakanda = new Country(wakandaPeople);
        Country middleEarth = new Country(middleEarthPeople);
        Country mordor = new Country(mordorPeople);
        Country tatooine = new Country(tatooinePeople);
        Country coruscant = new Country(coruscantPeople);

        Continent continent1 = new Continent();
        Continent continent2 = new Continent();
        Continent continent3 = new Continent();

        continent1.addCountry(sokovia);
        continent1.addCountry(wakanda);
        continent2.addCountry(middleEarth);
        continent2.addCountry(mordor);
        continent3.addCountry(tatooine);
        continent3.addCountry(coruscant);

        World world = new World();
        world.listOfContinents.add(continent1);
        world.listOfContinents.add(continent2);
        world.listOfContinents.add(continent3);

        //When
        BigDecimal peopleQuantityResult = world.getPeopleQuantity();

        //Then
        BigDecimal numberOfPeople = new BigDecimal("266666664");
        Assert.assertEquals(numberOfPeople, peopleQuantityResult);
    }
}
