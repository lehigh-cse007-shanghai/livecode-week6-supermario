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

        double perimeterFront = frontCircle.perimeter();
        double areaFront = frontCircle.area();

        backCircle.center_x = 5;
        backCircle.center_y = 2;
        backCircle.radius = 1.5;

        frontCircle.presentMySelf_non_static();
        backCircle.presentMySelf_non_static();

        frontCircle.static_member = 20;
        Circle.presentMySelf_static();
        backCircle.static_member = 30;
        Circle.presentMySelf_static();
        Circle.static_member = 40;
        System.out.println("frontCircle.static_member = " + frontCircle.static_member);
        frontCircle.presentMySelf_non_static();
        backCircle.presentMySelf_non_static();

        bicycle.frontCircle = frontCircle;
        bicycle.backCircle =  backCircle;

        // frontCircle = backCircle;
        bicycle.presentMyself();
    }
}
