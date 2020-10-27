package com.company;

public class Main {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.presentMyself();

        Circle frontCircle, backCircle;
        frontCircle = new Circle();
        backCircle = new Circle();
        frontCircle.center_x = 10;
        frontCircle.center_y = 2;
        frontCircle.radius = 1.5;

        backCircle.center_x = 5;
        backCircle.center_y = 2;
        backCircle.radius = 1.5;

        bicycle.frontCircle = frontCircle;
        bicycle.backCircle =  backCircle;

        bicycle.frontCircle.presentMySelf();
        bicycle.backCircle.presentMySelf();



        bicycle.presentMyself();
    }
}
