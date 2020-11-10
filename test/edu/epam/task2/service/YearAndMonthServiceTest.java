package edu.epam.task2.service;

import edu.epam.task2.entity.YearAndMonth;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class YearAndMonthServiceTest {

    @Test
    public void januaryDateCheck()
    {
        YearAndMonth date = new YearAndMonth(1, 2016);
        YearAndMonthService findContOfDays = new YearAndMonthService();
        int countOfDays = findContOfDays.findCountOfDays(date.getYear(),date.getMonth());
        Assert.assertEquals(countOfDays,31);
    }

    @Test
    public void isLeapYear()
    {
        YearAndMonth date = new YearAndMonth(2, 2016);
        YearAndMonthService findContOfDays = new YearAndMonthService();
        int countOfDays = findContOfDays.findCountOfDays(date.getYear(),date.getMonth());
        Assert.assertEquals(countOfDays,29);
    }

    @Test
    public void notLeapYear()
    {
        YearAndMonth date = new YearAndMonth(2, 2017);
        YearAndMonthService findContOfDays = new YearAndMonthService();
        int countOfDays = findContOfDays.findCountOfDays(date.getYear(),date.getMonth());
        Assert.assertEquals(countOfDays,28);
    }
}