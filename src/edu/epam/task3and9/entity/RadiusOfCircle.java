package edu.epam.task3and9.entity;

public class RadiusOfCircle {
    private double r;
    public RadiusOfCircle(double r)
    {
        if(r<=0)
        {
            throw new IllegalArgumentException("Radius is not valid!");
        }
        this.r=r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if(r<=0)
        {
            throw new IllegalArgumentException("Radius is not valid!");
        }
        this.r = r;
    }

    @Override
    public String toString() {
        return "r=" + r;
    }
}
