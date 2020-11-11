package edu.epam.task3and9.report;

public class ComputationResult {
    public void printCalculationResult(int describedArea, double inscribedSquareArea, double areaRation)
    {
        System.out.println("In square with area " + describedArea + " can be inscribed circle with inscribed square with area = " + inscribedSquareArea + ". Ration between areas is " + areaRation);
    }

    public void printCircumference(double circumference)
    {
        System.out.println("circumference is " + circumference);
    }
    public void printAreaOfTheCircle(double areaOfTheCircle)
    {
        System.out.println("areaOfTheCircle is " + areaOfTheCircle);
    }
}
