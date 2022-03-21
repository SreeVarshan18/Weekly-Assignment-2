package com.harman.assignment;

import java.util.Scanner;
import java.text.DecimalFormat;

abstract class Shape {

    abstract void RectangleArea(float length, float breadth);
    abstract void SquareArea(float side);
    abstract void CircleArea(float radius);
}

class Area extends Shape{
    final DecimalFormat df = new DecimalFormat("0.00");

    void RectangleArea(float length, float breadth){
        double a=length*breadth;
        System.out.print("Area Of Rectangle: ");
        System.out.println(df.format(a));
    }
    void SquareArea(float side){
        double a=side*side;
        System.out.print("Area Of Square: ");
        System.out.println(df.format(a));
    }
    void CircleArea(float radius){
        double a=3.14*radius*radius;
        System.out.print("Area Of Circle: ");
        System.out.println(df.format(a));
    }

}
class Mainclass{

    public static void main(String[] args) {


        Shape obj = new Area();

        System.out.println("Enter Length and Breadth: ");
        Scanner input = new Scanner(System.in);
        float x = input.nextFloat();
        float y = input.nextFloat();
        obj.RectangleArea(x, y);
        System.out.println("Enter Length of side of a square: ");
        float s = input.nextFloat();
        obj.SquareArea(s);
        System.out.println("Enter Radius of a Circle: ");
        float r = input.nextFloat();
        obj.CircleArea(r);
    }
}