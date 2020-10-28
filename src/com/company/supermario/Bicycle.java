package com.company.supermario;

public class Bicycle {
    // TODO: add different constructors

    Circle frontCircle = new Circle(1, 2, 3);
    Circle backCircle = new Circle(4, 5, 6);
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
        frontCircle.setCenter_x(88);
        System.out.println("My front cycle is: " +
                frontCircle.getCenter_x() + " " + frontCircle.center_y +
                " " + frontCircle.perimeter() + " " +
                frontCircle.area());
        System.out.println("My back cycle is: " +
                backCircle.getCenter_x() + " " + backCircle.center_y +
                " " + backCircle.perimeter() + " " +
                backCircle.area());
    }

    public static void main(String[] args){
        Bicycle bicycle = new Bicycle();
        bicycle.presentMyself();
    }

}
