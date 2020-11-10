package edu.epam.task7.main;

import edu.epam.task7.entity.NumberForCheck;
import edu.epam.task7.report.ComputationResult;
import edu.epam.task7.service.NumberService;

public class NumbersMain {
    public static void main(String[] args)
    {
        NumberForCheck numberForCheck = new NumberForCheck(33550336);
        NumberService service = new NumberService();
        boolean numberIsPerfect = service.numberIsPerfect(numberForCheck.getNumber());
        ComputationResult result = new ComputationResult();
        result.printCalculationResult(numberForCheck.getNumber(),numberIsPerfect);
    }
}
