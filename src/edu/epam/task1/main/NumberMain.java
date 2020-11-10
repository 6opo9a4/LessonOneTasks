package edu.epam.task1.main;

import edu.epam.task1.report.NumberReport;
import edu.epam.task1.service.NumberService;
import edu.epam.task1.variables.SuppliedNumber;

public class NumberMain {
    public static void main(String[] args)
    {
        SuppliedNumber number1 = new SuppliedNumber(23);
        NumberService calk = new NumberService();
        int result1 = calk.findEndOFTheSquare(number1.getNumber());
        NumberReport report =  new NumberReport();
        report.printCalculationResult(number1.getNumber(),result1);
    }
}
