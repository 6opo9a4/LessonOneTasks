package edu.epam.task7.report;

import edu.epam.task7.entity.Point;

public class ComputationResult {
    public void printCalculationResult(Point firstPoint, Point secondPoint, Point[] closerPoint)
    {
        if(closerPoint.length == 1) {
            System.out.println("between points a" + firstPoint.toString() + " and b" + secondPoint.toString() + " closer to the origin point with coordinates " + closerPoint[0].toString());
        }
        else{
            System.out.println("points a" + firstPoint.toString() + " and b" + secondPoint.toString() + "slave distance from the beginning of the coordinate");
        }
    }
}
