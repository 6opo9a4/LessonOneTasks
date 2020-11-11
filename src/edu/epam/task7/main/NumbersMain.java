package edu.epam.task7.main;

import edu.epam.task7.entity.Point;
import edu.epam.task7.report.ComputationResult;
import edu.epam.task7.service.PointsService;

public class NumbersMain {
    public static void main(String[] args)
    {
        Point first =  new Point(21,4);
        Point second =  new Point(12,48);
        PointsService service =  new PointsService();
        ComputationResult result =  new ComputationResult();
        result.printCalculationResult(first,second,service.distanceComparison(first,second));
    }
}
