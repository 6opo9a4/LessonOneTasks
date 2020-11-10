package edu.epam.task3.service;

public class SquareAreaService {

    public int squareSideLengthIs(int area)
    {
        return (int)Math.round(Math.sqrt(area));
    }
    public int radiusOfTheInscribedCircleIs(int area)
    {
        return (int)Math.round(Math.sqrt(area))/2;
    }
    public int areaRationOfSquares(int describedArea, int inscribedArea)
    {
        return describedArea/inscribedArea;
    }
}
