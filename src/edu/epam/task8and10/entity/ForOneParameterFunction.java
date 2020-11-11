package edu.epam.task8and10.entity;

public class ForOneParameterFunction {
    private int x;
    public ForOneParameterFunction(int x)
    {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "x=" + x;
    }
}
