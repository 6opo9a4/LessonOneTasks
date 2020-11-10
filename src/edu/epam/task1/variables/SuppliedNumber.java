package edu.epam.task1.variables;

public class SuppliedNumber {

    private int number;

    public SuppliedNumber(int number)
    {
        this.number = number;
    }

    public int getNumber()
    {
       return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    @Override
    public String toString()
    {
        return "number=" + number;
    }
}
