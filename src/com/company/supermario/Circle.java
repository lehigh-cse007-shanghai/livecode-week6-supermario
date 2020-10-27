package com.company;

public class Circle {
    // TODO: three different constructors
    // TODO: This keyword for constructor
    double center_x;
    double center_y;
    double radius;

    void presentMySelf()
    {
        // TODO: this keyword here
        System.out.println("My center_x is: " + center_x);
        System.out.println("My center_y is: " + center_y);
        System.out.println("My perimeter is" + this.perimeter());
        System.out.println("My area is" + this.area());
    }

    // TODO: this keyword here
    double perimeter()
    {
        return 2 * Math.PI * radius;
    }

    double area()
    {
        return Math.PI * radius * radius;
    }
}
