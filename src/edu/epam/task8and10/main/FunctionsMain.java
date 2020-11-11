package edu.epam.task8and10.main;

import edu.epam.task8and10.entity.ForOneParameterFunction;
import edu.epam.task8and10.entity.ForTrigonometricFunction;
import edu.epam.task8and10.report.ComputationResult;
import edu.epam.task8and10.service.FunctionsService;

public class FunctionsMain {
    public static void main(String[] args)
    {
        ForOneParameterFunction x1 = new ForOneParameterFunction(-14);
        FunctionsService service =  new FunctionsService();
        ComputationResult result =  new ComputationResult();
        result.firstFunctionResult(x1.getX(),service.firsFunctionFind(x1.getX()));

        ForTrigonometricFunction tgX1 = new ForTrigonometricFunction(3,1,1,10);
        result.trigonometricFunctionResult(service.tgFunctionFind(tgX1.getX(),tgX1.getStep(),tgX1.getA(),tgX1.getB()));
    }
}
