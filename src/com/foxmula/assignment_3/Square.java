package com.foxmula.assignment_3;

public class Square extends Quadrilateral{
    public Square(int a, int b, int c, int d, int e, int f,int g,int h) {
        super(a, b, c, d, e, f,g,h);
    }

    @Override
    public double area()
    {
        double a1 = (double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double ans= (double)a1*a1;


        return ans;

    }
}
