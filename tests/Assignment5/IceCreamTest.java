package Assignment5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    @Test
    public void getIceCreamcost() {
        //Given
        int cost = 10;
        //int centsPerLb = 399;

        //when
        DessertItem dessertItem = new IceCream("IceCream", cost);

        //Then
        Assert.assertTrue(((IceCream) dessertItem).getIceCreamcost() == cost);
    }

    @Test
    public void getCost() {
        int cost = 10;
        //int centsPerLb = 399;

        //when
        DessertItem dessertItem = new IceCream("IceCream", cost);

        //Then
        Assert.assertTrue(((IceCream) dessertItem).getCost() == cost);
    }
}