package edu.epam.task8and10.service;

import edu.epam.task8and10.entity.ForTrigonometricFunction;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FunctionsServiceTest {
    @Test
    public void tgFuncWithNegativeStep()
    {
        ForTrigonometricFunction tgX1 = new ForTrigonometricFunction(0,-2,-4,1);
        FunctionsService service =  new FunctionsService();
        double[][] expected = service.tgFunctionFind(tgX1.getX(),tgX1.getStep(),tgX1.getA(),tgX1.getB());
        double x1 =  Math.tan(0);
        double x2 =  Math.tan(-2);
        double x3 =  Math.tan(-4);
        Assert.assertEquals(expected,new double[][] {{0,-2,-4},{x1,x2,x3}});
    }


}