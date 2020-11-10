package edu.epam.task3.service;

public class CircleRadiusService {
    public int inscribedSquareAreaIs(int radius)
    {
        return 2*radius*radius;
    }
    public int describedSquareAreaIs(int radius)
    {
        return 4*radius*radius;
    }
}
