package com.company;

public class Bicycle {
    // TODO: add different constructors

    Circle frontCircle = new Circle();
    Circle backCircle = new Circle();
    int speed = 10;

    void speedUp(){
        speed += 2;
    }

    void slowDown(){
        speed -= 2;
    }

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
