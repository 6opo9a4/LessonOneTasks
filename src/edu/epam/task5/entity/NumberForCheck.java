package edu.epam.task5.entity;

import java.math.BigInteger;

public class NumberForCheck {
    private int number;
    public NumberForCheck(int number)
    {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "number=" + number;
    }
}
