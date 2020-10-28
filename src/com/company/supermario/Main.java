package com.company.supermario;

import com.company.breakpoint.CallByValue;

public class Main {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.presentMyself();

        Circle frontCircle, backCircle;
        frontCircle = new Circle(10, 2, 1.5);
        backCircle = new Circle(5, 2, 1.5);

        bicycle.frontCircle = frontCircle;
        bicycle.backCircle =  backCircle;

        bicycle.frontCircle.presentMySelf();
        bicycle.backCircle.presentMySelf();
        bicycle.presentMyself();

        CallByValue cbv = new CallByValue();
        cbv.function();
        cbv.attribute = 10;

    }
}
