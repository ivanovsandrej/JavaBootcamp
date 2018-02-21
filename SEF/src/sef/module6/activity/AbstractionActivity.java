package sef.module6.activity;

public class AbstractionActivity {

    public static void main(String[] args) {
        Square square = new Square(4d);
        Rectangle rectangle = new Rectangle(5d,6d);

        square.setColor("Red");
        rectangle.setColor("Yellow");

        System.out.println("*** Print the Information for Squae ****");
        System.out.println("Color of Squae      :" + square.getColor());
        System.out.println("Area of Square      :" + square.calculateArea());
        System.out.println("Perimeter of Square :" + square.calculatePerimeter());

        System.out.println("*** Print the Information for Rectangle ****");
        System.out.println("Color of Rectangle      :" + rectangle.getColor());
        System.out.println("Area of Rectangle      :" + rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle :" + rectangle.calculatePerimeter());
    }

}
