package Assignment5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DessertItemTest {


    @Test
    public void shouldCreateDesserItemAndReturnName() {
        //Given
        String name = "Peanut Butter Fudge";
        double weight = 2.25;
        int centsPerLb = 399;

        //when
        DessertItem dessertItem = new Candy(name, weight,centsPerLb);

        //Then
        Assert.assertTrue(dessertItem.getName().equals(name));
    }

    @Test
    public void shouldCalculateCostAndReturnCost() {
        double weight = 2.25;
        int centsPerLb = 399;
        int cost = (int) (weight * centsPerLb);

        DessertItem dessertItem = new Candy("Peanut Butter Fudge", weight,centsPerLb);

        Assert.assertEquals(true, dessertItem.getCost() == cost);

    }

    @Test
    public void print() {

    }
}