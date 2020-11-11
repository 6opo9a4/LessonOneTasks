package edu.epam.task8and10.report;

import java.util.Arrays;

public class ComputationResult {
    public void firstFunctionResult(int x, double result)
    {
        System.out.println("The result of calculating the function F(x) with variable x=" + x + " will be " + result);
    }
    public void trigonometricFunctionResult(double[][] result) {
        for (int i = 0; i < result[0].length; i++) {
                System.out.print(result[0][i] + ", " + result[1][i] +"\n");
        }
    }
}
