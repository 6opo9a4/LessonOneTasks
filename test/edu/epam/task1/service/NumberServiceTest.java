package edu.epam.task1.service;

import edu.epam.task1.variables.SuppliedNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberServiceTest {

    @Test
    public void findingTheLastDigit1()
    {
        int number = 21;
        String str = "" + number;
        char[] strToArray = str.toCharArray();
        int actual = strToArray[strToArray.length-1] - '0';
        Assert.assertEquals(actual,1);
    }
    @Test
    public void findingTheLastDigit2()
    {
        int number = 2;
        String str = "" + number;
        char[] strToArray = str.toCharArray();
        int actual = strToArray[strToArray.length-1] - '0';
        Assert.assertEquals(actual,2);
    }
    @Test
    public void simpleNumberTest()
    {
        SuppliedNumber number1 = new SuppliedNumber(14);
        NumberService calk = new NumberService();
        int actual = calk.findEndOFTheSquare(number1.getNumber());
        Assert.assertEquals(actual,6);
    }
    @Test
    public void negativeNumberTest()
    {
        SuppliedNumber number1 = new SuppliedNumber(-23);
        NumberService calk = new NumberService();
        int actual = calk.findEndOFTheSquare(number1.getNumber());
        Assert.assertEquals(actual,9);
    }
}