package edu.epam.task3.report;

public class ComputationResult {
    public void printCalculationResult(int describedArea, int inscribedSquareArea, int areaRation)
    {
        System.out.println("In square with area " + describedArea + " can be inscribed circle with inscribed square with area = " + inscribedSquareArea + ". Ration between areas is " + areaRation);
    }
}
