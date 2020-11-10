package edu.epam.task8.service;

public class NumberService {
    public boolean numberIsPerfect(int number)
    {
        boolean isPerfect;
        int sumOfDividers = 0;
        if(number <= 0)
        {
            isPerfect =false;
        }
        else
        {
            for(int i = 1; i < number;i++)
            {
                if(number%i==0)
                {
                    sumOfDividers = sumOfDividers + i;
                }
            }
            if(sumOfDividers == number)
            {
                isPerfect = true;
            }
            else
            {
                isPerfect = false;
            }
        }
        return isPerfect;
    }
}
