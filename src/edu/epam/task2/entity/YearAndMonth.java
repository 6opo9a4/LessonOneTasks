package edu.epam.task2.entity;

public class YearAndMonth {
    private int year;
    private int month;

    public YearAndMonth(int month, int year)
    {
        if(year > 7777 || year < 1)
        {
            throw new IllegalArgumentException("Year is not valid!");
        }
        if(month > 12 || month < 1)
        {
            throw new IllegalArgumentException("Month is not valid!");
        }
        this.month = month;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        if(year > 3000 || year < 1)
        {
            throw new IllegalArgumentException("Year is not valid!");
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if(month > 12 || month < 1)
        {
            throw new IllegalArgumentException("Month is not valid!");
        }
        this.month = month;
    }

    @Override
    public String toString() {
        return "year=" + year + ", month=" + month;
    }
}
