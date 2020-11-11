package edu.epam.task7.service;

import edu.epam.task7.entity.Point;

public class PointsService {
    public Point[] distanceComparison(Point first,Point second)
    {
        int distanceOfFirst = (int)Math.round(Math.sqrt(first.getX()*first.getX() + first.getY()*first.getY()));
        int distanceOfSecond = (int)Math.round(Math.sqrt(second.getX()*second.getX() + second.getY()*second.getY()));
        if(distanceOfFirst<distanceOfSecond)
        {
            return new Point[] {first};
        }
        if(distanceOfFirst>distanceOfSecond)
        {
            return new Point[] {second};
        }
        else
        {
            return new Point[] {first,second};
        }
    }

}
