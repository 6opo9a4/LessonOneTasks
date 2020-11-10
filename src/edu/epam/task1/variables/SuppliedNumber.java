package edu.epam.task1.variables;

public class SuppliedNumber {

    private int number;

    public SuppliedNumber(int number)
    {
        setNumber(number);
       // this.number = number;
    }

    public int getNumber()
    {
       return number;
    }

    public void setNumber(int number)
    {
        //тут ти проверка
        this.number = number;
    }

    @Override
    public String toString()
    {
        return "number=" + number;
    }
}
