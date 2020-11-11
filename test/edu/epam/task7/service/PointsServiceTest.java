package edu.epam.task7.service;

import edu.epam.task7.entity.Point;
import edu.epam.task7.report.ComputationResult;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointsServiceTest {
    @Test
    public void equalsPointComparatorTest()
    {
        Point first =  new Point(21,21);
        Point second =  new Point(21,21);
        PointsService service =  new PointsService();
        Assert.assertEquals(service.distanceComparison(first,second).length,2);
    }

    @Test
    public void negativePointsTest()
    {
        Point first =  new Point(-100,78);
        Point second =  new Point(-4,-5);
        PointsService service =  new PointsService();
        Assert.assertEquals(service.distanceComparison(first,second)[0].getX(),second.getX());
        Assert.assertEquals(service.distanceComparison(first,second)[0].getY(),second.getY());
    }

}