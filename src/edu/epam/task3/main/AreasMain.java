package edu.epam.task3.main;

import edu.epam.task3.entity.SquareArea;
import edu.epam.task3.report.ComputationResult;
import edu.epam.task3.service.CircleRadiusService;
import edu.epam.task3.service.SquareAreaService;

public class AreasMain {
    public static void main(String[] args)
    {
        SquareArea area = new SquareArea(156);
        SquareAreaService areaService = new SquareAreaService();
        int radius =  areaService.radiusOfTheInscribedCircleIs(area.getArea());
        CircleRadiusService radiusService = new CircleRadiusService();
        int inscribedArea =  radiusService.inscribedSquareAreaIs(radius);
        int areaRation = areaService.areaRationOfSquares(area.getArea(),inscribedArea);
        ComputationResult report =new ComputationResult();
        report.printCalculationResult(area.getArea(),inscribedArea,areaRation);
    }
}
