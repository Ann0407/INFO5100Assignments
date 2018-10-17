package Assignment4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Assignment4Test {

    @Before
    public void setUp() {
        Assignment4 assignment4 = new Assignment4();
    }

    @Test
    public void firstUniqChar() {
        Assignment4 assignment4 = new Assignment4();
        assignment4.firstUniqChar("loveleetcode");
    }

    @Test
    public void addDigits() {
        Assignment4 assignment4 = new Assignment4();
        assignment4.addDigits(38);
    }

    @Test
    public void moveZeroes() {
        Assignment4 assignment4 = new Assignment4();
        int[] list = {0,1,0,3,12};
        assignment4.moveZeroes(list);
    }

    @Test
    public void longestPalindrome() {
        Assignment4 assignment4 = new Assignment4();
        assignment4.longestPalindrome("babad");
    }

    @Test
    public void rotate() {
        Assignment4 assignment4 = new Assignment4();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        assignment4.rotate(matrix);
    }
}