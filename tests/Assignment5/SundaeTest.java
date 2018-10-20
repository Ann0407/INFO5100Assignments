package Assignment5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SundaeTest {

    @Test
    public void getSundaeCost() {
        //Given
        int cost = 10;
        //int centsPerLb = 399;

        //when
        IceCream iceCream = new Sundae("Choc. Chip Ice Cream",145,"Hot Fudge",cost);

        //Then
        Assert.assertTrue(((Sundae) iceCream).getSundaeCost() == cost);
    }

    @Test
    public void getSundaeName() {
        //Given
        //int cost = 10;
        String name = "Hot Fudge";

        //when
        IceCream iceCream = new Sundae("Choc. Chip Ice Cream",145,name,10);

        //Then
        Assert.assertTrue(((Sundae) iceCream).getSundaeName().equals(name));
    }


}