package com.company;

public class Circle {
    double center_x;
    double center_y;
    double radius;

    static double static_member;


    static void presentMySelf_static()
    {
        System.out.println("My static_member is :" + static_member);
        // These two lines won't pass because in static function, we cannot use class variables, but only static variables.
        //        System.out.println("My center_x is: " + center_x);
        //        System.out.println("My center_y is: " + center_y);
    }

    void presentMySelf_non_static()
    {
        // OK to use static variables in non-static functions
        System.out.println("My static_member is :" + static_member);
        System.out.println("My center_x is: " + center_x);
        System.out.println("My center_y is: " + center_y);
    }


    double perimeter()
    {
        return 2 * Math.PI * radius;
    }

    double area()
    {
        return Math.PI * radius * radius;
    }
}
