package edu.epam.task3and9.service;

import edu.epam.task3and9.entity.RadiusOfCircle;
import edu.epam.task3and9.entity.SquareArea;
import edu.epam.task3and9.report.ComputationResult;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SquareAreaServiceTest {
    @Test
    public void squareAreaTest()
    {
        SquareArea area = new SquareArea(145);
        SquareAreaService areaService = new SquareAreaService();
        RadiusOfCircle radius =  new RadiusOfCircle(areaService.radiusOfTheInscribedCircleIs(area.getArea()));
        CircleRadiusService radiusService = new CircleRadiusService();
        double inscribedArea =  radiusService.inscribedSquareAreaIs(radius.getR());
        Assert.assertEquals(inscribedArea,72.5);
    }
}