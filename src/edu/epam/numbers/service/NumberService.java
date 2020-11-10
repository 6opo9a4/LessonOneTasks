package edu.epam.numbers.service;

public class NumberService {

    public int findEndOFTheSquare(int number){
        int endOfTheSquare;
        int endOfTheNumber = lastNumeral(number);
        endOfTheSquare = lastNumeral(endOfTheNumber* endOfTheNumber);
        return endOfTheSquare;
    }

    public int lastNumeral(int number)
    {
        int lastNumeral;
        String str = ""+number;
        char[] strToArray = str.toCharArray();
        lastNumeral = strToArray[strToArray.length-1] - '0';
        return lastNumeral;
    }
}
