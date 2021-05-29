package com.foxmula.assignment_3;

public class MainQuad {
    public static void main(String[] args) {
        Quadrilateral q1= new Square(1,2,3,2,3,4,1,4);
        System.out.println("Area of SQUARE= "+q1.area());
        Quadrilateral q2= new Trapezoid(0,0,20,0,17,6,8,6,6);
        System.out.println("Area of Trapezoid= "+q2.area());
        Quadrilateral q3= new Parallelogram(10,10,30,10,20,20,0,20,8);
        System.out.println("Area of Parallelogram= "+q3.area());
        Quadrilateral q4= new Rectangle(2,4,6,4,6,10,2,10);
        System.out.println("Area of Rectangle= "+q4.area());
    }
}
