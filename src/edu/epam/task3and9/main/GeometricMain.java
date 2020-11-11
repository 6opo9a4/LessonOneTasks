package edu.epam.task3and9.main;

import edu.epam.task3and9.entity.RadiusOfCircle;
import edu.epam.task3and9.entity.SquareArea;
import edu.epam.task3and9.report.ComputationResult;
import edu.epam.task3and9.service.CircleRadiusService;
import edu.epam.task3and9.service.SquareAreaService;

public class GeometricMain {
    public static void main(String[] args)
    {
        SquareArea area = new SquareArea(156);
        SquareAreaService areaService = new SquareAreaService();
        RadiusOfCircle radius =  new RadiusOfCircle(areaService.radiusOfTheInscribedCircleIs(area.getArea()));
        CircleRadiusService radiusService = new CircleRadiusService();
        double inscribedArea =  radiusService.inscribedSquareAreaIs(radius.getR());
        double areaRation = areaService.areaRationOfSquares(area.getArea(),inscribedArea);
        ComputationResult report =new ComputationResult();
        report.printCalculationResult(area.getArea(),inscribedArea,areaRation);

        report.printAreaOfTheCircle(radiusService.areaOfTheCircleIs(radius.getR()));
        report.printCircumference(radiusService.circumferenceIs(radius.getR()));
    }
}
