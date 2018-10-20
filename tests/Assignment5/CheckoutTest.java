package Assignment5;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;

public class CheckoutTest {

    @Test
    public void enterItem() {

        //List<DessertItem> dessertItems = new LinkedList<DessertItem>();
        Checkout checkout = new Checkout();
        DessertItem candy = new Candy("Peanut Butter Fudge", 2.25,399);
        DessertItem cookie = new Cookie("Vanilla Ice Cream", 105,455);
        checkout.enterItem(candy);
        checkout.enterItem(cookie);

        List<DessertItem> actual = checkout.getDessertItems();

        assertEquals(candy.getCost(), actual.get(0).getCost());
        assertEquals(candy.getName(), actual.get(0).getName());

        //Assert.assertEquals(Objects.equals(checkout.getDessertItems(), checkout.enterItem(candy)));


    }

    @Test
    public void numberOfItems() {
        Checkout checkout = new Checkout();
        DessertItem candy = new Candy("Peanut Butter Fudge", 2.25,399);
        DessertItem cookie = new Cookie("Vanilla Ice Cream", 105,455);
        checkout.enterItem(candy);
        checkout.enterItem(cookie);
        List<DessertItem> actual = checkout.getDessertItems();
        actual.add(candy);
        actual.add(cookie);

        assertEquals(checkout.numberOfItems(),actual.size());

    }



    @Test
    public void totalCost() {
        Checkout checkout = new Checkout();
        DessertItem candy = new Candy("Peanut Butter Fudge", 2.25,399);
        //DessertItem cookie = new Cookie("Vanilla Ice Cream", 105,455);
        checkout.enterItem(candy);
        //List<DessertItem> actual = checkout.getDessertItems();
        int cost = (int) (2.25 * 399);

        assertEquals(checkout.totalCost(), cost);

    }

    @Test
    public void totalTax() {
        Checkout checkout = new Checkout();
        DessertItem candy = new Candy("Peanut Butter Fudge", 2.25,399);
        double weight = 2.25;
        int centsPerLb = 399;
        int cost = (int) (weight * centsPerLb);
        int tax = (int) (0.065 * cost);

        Assert.assertEquals(checkout.totalTax(),tax);
    }
}


/*
checkout.enterItem(new Candy("Peanut Butter Fudge", 2.25,399));
        checkout.enterItem(new IceCream("Vanilla Ice Cream", 105));
        checkout.enterItem(new Sundae("Choc. Chip Ice Cream",145,"Hot Fudge",50));
        checkout.enterItem(new Cookie("Oatmeal Raision Cookies",4,399));
 */