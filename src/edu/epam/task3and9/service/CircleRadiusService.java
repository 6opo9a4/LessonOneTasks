package edu.epam.task3and9.service;

public class CircleRadiusService {
    public double inscribedSquareAreaIs(double radius)
    {
        return 2*radius*radius;
    }
    public double describedSquareAreaIs(double radius)
    {
        return 4*radius*radius;
    }
    public double circumferenceIs(double radius)
    {
        return 2*3.1415*radius;
    }
    public double areaOfTheCircleIs(double radius)
    {
        return 3.1415*radius*radius;
    }
}
