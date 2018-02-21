package sef.module6.activity;

public class Rectangle extends Shape  {
    public double side1, side2;

    Rectangle(double side1, double side2)
    {
        this.side1 = side1;
        this.side2 = side2;
    }

 /*   Rectangle(double side1)
    {
        this.side1 = side1;
        this.side2 = side1;
    }
*/
    public double calculateArea()
    {
        return side1 * side2;
    }

    public double calculatePerimeter()
    {
        return (side1 + side2) * 2;
    }
}
