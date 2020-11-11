package edu.epam.task3and9.service;

public class SquareAreaService {

    public double squareSideLengthIs(int area)
    {
        return Math.sqrt(area);
    }
    public double radiusOfTheInscribedCircleIs(int area)
    {
        return Math.sqrt(area)/2;
    }
    public double areaRationOfSquares(double describedArea, double inscribedArea)
    {
        return describedArea/inscribedArea;
    }
}
