package edu.epam.task2.main;

import edu.epam.task2.entity.YearAndMonth;
import edu.epam.task2.report.DaysReport;
import edu.epam.task2.service.YearAndMonthService;

public class DatesMain {
    public static void main(String[] args)
    {
        YearAndMonth date = new YearAndMonth(2, 2017);
        YearAndMonthService findContOfDays = new YearAndMonthService();
        int countOfDays = findContOfDays.findCountOfDays(date.getYear(),date.getMonth());
        DaysReport report = new DaysReport();
        report.printCalculationResult(date.getYear(),date.getMonth(),countOfDays);
    }
}
