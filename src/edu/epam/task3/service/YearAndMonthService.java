package edu.epam.task3.service;

public class YearAndMonthService {
    public boolean isLeapYear(int year)
    {
        boolean leapYear;
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    leapYear = true;
                }
                else
                {
                    leapYear = false;
                }
            }
            else
            {
                leapYear = true;
            }

        }
        else
        {
            leapYear = false;
        }

        return leapYear;
    }

    public int findCountOfDays(int year, int month)
    {
        int  daysCount =  28 + (month + month / 8) % 2 + 2 % month + 1 / month * 2;
        if(isLeapYear(year) && month == 2)
        {
           daysCount++;
        }
        return daysCount;
    }
}
