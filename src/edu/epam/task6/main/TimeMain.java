package edu.epam.task6.main;

import edu.epam.task6.entity.TimeInSeconds;
import edu.epam.task6.report.ConversionResult;
import edu.epam.task6.service.TimeConvertService;

public class TimeMain {
    public static void main(String[] args)
    {
        TimeInSeconds seconds = new TimeInSeconds(63);
        TimeConvertService convert =  new TimeConvertService();
        int[] converted =  convert.secondsConvert(seconds.getSeconds());
        ConversionResult result = new ConversionResult();
        result.printConversionResult(seconds.getSeconds(),converted[0],converted[1],converted[2]);
    }
}
