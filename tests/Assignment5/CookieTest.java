package Assignment5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CookieTest {

    @Test
    public void getNumbers() {
        //Given
        int numbers = 4;
        //int centsPerLb = 399;

        //when
        DessertItem dessertItem = new Cookie("Cookies", numbers, 399);

        //Then
        Assert.assertTrue(((Cookie) dessertItem).getNumbers() == numbers);
    }

    @Test
    public void getPricePerDozen() {
        //Given
        //int numbers = 4;
        int pricePerDozen = 399;

        //when
        DessertItem dessertItem = new Cookie("Cookies", 4, pricePerDozen);

        //Then
        Assert.assertTrue(((Cookie) dessertItem).getPricePerDozen() == pricePerDozen);
    }

    @Test
    public void getCost() {
        int numbers = 4;
        int pricePerDozen = 399;
        int cost = (int) (numbers * pricePerDozen);

        DessertItem dessertItem = new Cookie("Cookies", 4, 399);

        Assert.assertEquals(true, dessertItem.getCost() == cost);
    }
}