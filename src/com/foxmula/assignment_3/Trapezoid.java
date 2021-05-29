package com.foxmula.assignment_3;

public class Trapezoid extends Quadrilateral{

    int height;

    public Trapezoid(int a, int b, int c, int d, int e, int f,int g,int h,int hei) {
        super(a, b, c, d, e, f,g,h);
        this.height=hei;
    }

    @Override
    public double area()
    {
        double a1 = (double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double a2 = (double)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
        double ans= (double)((a1+a2)*height)/2;


        return ans;

    }

}

