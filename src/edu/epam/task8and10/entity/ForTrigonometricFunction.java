package edu.epam.task8and10.entity;

public class ForTrigonometricFunction {
    private int x;
    private  int step;
    private int a;
    private int b;
    public ForTrigonometricFunction(int x, int step,int a, int b)
    {
        if(a>b)
        {
            throw new IllegalArgumentException("Section is not valid!");
        }
        this.x=x;
        this.step=step;
        this.a=a;
        this.b=b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "x=" + x +", step=" + step +", section=[" + a + ", " + b + ']';
    }
}
