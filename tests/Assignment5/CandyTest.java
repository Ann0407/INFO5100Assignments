package Assignment5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandyTest {

    @Test
    public void shouldGetWeightAndReturnWeightOfCandy() {

        //Given
        double weight = 2.25;
        //int centsPerLb = 399;

        //when
        DessertItem dessertItem = new Candy("Peanut Butter Fudge", weight,399);

        //Then
        Assert.assertTrue(((Candy) dessertItem).getWeight() == weight);
    }

    @Test
    public void shouldGetPriceAndReturnPricePerLb() {
        //Given
        //double weight = 2.25;
        int centsPerLb = 399;

        //when
        DessertItem dessertItem = new Candy("Peanut Butter Fudge", 2.25, centsPerLb);

        //Then
        Assert.assertTrue(((Candy) dessertItem).getWeight() == centsPerLb);
    }

    @Test
    public void shouldCalculateCostAndReturnCost() {
        double weight = 2.25;
        int centsPerLb = 399;
        int cost = (int) (weight * centsPerLb);

        DessertItem dessertItem = new Candy("Peanut Butter Fudge", 2.25,399);

        Assert.assertEquals(true, dessertItem.getCost() == cost);

    }

}