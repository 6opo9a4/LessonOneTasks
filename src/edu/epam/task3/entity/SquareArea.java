package edu.epam.task3.entity;

public class SquareArea {
    private int area;
    public SquareArea(int area)
    {
        if(area <= 0)
        {
            throw new IllegalArgumentException("Area is not valid!");
        }
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if(area <= 0)
        {
            throw new IllegalArgumentException("Area is not valid!");
        }
        this.area = area;
    }

    @Override
    public String toString() {
        return "area=" + area;
    }
}
