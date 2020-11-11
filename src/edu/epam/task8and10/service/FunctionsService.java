package edu.epam.task8and10.service;

import edu.epam.task8and10.entity.ForTrigonometricFunction;

import java.awt.event.MouseAdapter;
import java.util.ArrayList;

public class FunctionsService {
    public double firsFunctionFind(int value)
    {
        double x = value;
        if(x>=3)
        {
            return -x*x + 3*x +9;
        }
        else
        {
            return 1/(x*x*x - 6);
        }
    }

    public double[][] tgFunctionFind(int x, int h, int a, int b)
    {
        ArrayList<Double> val  =  new ArrayList<>();
        ArrayList<Double> res  =  new ArrayList<>();
        while(x>=a && x<=b)
        {
            double dobX = (double)x;
            val.add((double) x);
            res.add(Math.tan(dobX));
            x=x+h;
        }
        double[] value = new double[val.size()];
        double[] result = new double[val.size()];
        for(int i = 0;i<val.size();i++)
        {
            value[i]=val.get(i);
            result[i]=res.get(i);
        }
        return new double[][] {value,result};
    }
}
