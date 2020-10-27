package com.company;

public class Bicycle {
    Circle frontCircle = new Circle();
    Circle backCircle = new Circle();

    void presentMyself()
    {
        System.out.println("I have two cycles.");
        System.out.println("My front cycle is: " +
                frontCircle.center_x + " " + frontCircle.center_y +
                " " + frontCircle.perimeter() + " " +
                frontCircle.area());
        System.out.println("My back cycle is: " +
                backCircle.center_x + " " + backCircle.center_y +
                " " + backCircle.perimeter() + " " +
                backCircle.area());
    }
}
