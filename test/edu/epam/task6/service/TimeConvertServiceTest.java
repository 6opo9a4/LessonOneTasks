package edu.epam.task6.service;

import edu.epam.task6.entity.TimeInSeconds;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TimeConvertServiceTest {
    @Test
    public void onlyHoursTest()
    {
        TimeInSeconds seconds = new TimeInSeconds(3600);
        TimeConvertService convert =  new TimeConvertService();
        int[] converted =  convert.secondsConvert(seconds.getSeconds());
        Assert.assertEquals(converted[0],1);
        Assert.assertEquals(converted[1],0);
        Assert.assertEquals(converted[2],0);
    }

    @Test
    public void onlyMinutesTest()
    {
        TimeInSeconds seconds = new TimeInSeconds(120);
        TimeConvertService convert =  new TimeConvertService();
        int[] converted =  convert.secondsConvert(seconds.getSeconds());
        Assert.assertEquals(converted[0],0);
        Assert.assertEquals(converted[1],2);
        Assert.assertEquals(converted[2],0);
    }

    @Test
    public void onlySecondsTest()
    {
        TimeInSeconds seconds = new TimeInSeconds(13);
        TimeConvertService convert =  new TimeConvertService();
        int[] converted =  convert.secondsConvert(seconds.getSeconds());
        Assert.assertEquals(converted[0],0);
        Assert.assertEquals(converted[1],0);
        Assert.assertEquals(converted[2],13);
    }

    @Test
    public void fullTimeTest()
    {
        TimeInSeconds seconds = new TimeInSeconds(3666);
        TimeConvertService convert =  new TimeConvertService();
        int[] converted =  convert.secondsConvert(seconds.getSeconds());
        Assert.assertEquals(converted[0],1);
        Assert.assertEquals(converted[1],1);
        Assert.assertEquals(converted[2],6);
    }
}