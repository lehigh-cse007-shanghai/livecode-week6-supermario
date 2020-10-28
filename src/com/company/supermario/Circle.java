package com.company.supermario;

public class Circle {
    // TODO: three different constructors
    // TODO: This keyword for constructor
    private double center_x;
    double center_y;
    double radius;

    public double getCenter_x(){
        return center_x;
    }

    public void setCenter_x(double x){
        this.center_x = x;
    }

    private void sayHello(){
        System.out.println("Hello World");
    }


    void Circle(double x, double y, double r)
    {
        System.out.println("I am a function/method.");
    }

    Circle(double x, double y, double r){
        this.center_x = x;
        this.center_y = y;
        this.radius = r;
        System.out.println("I am a constructor.");
    }

    public Circle() {
        this(0, 0, 10);
    }

    public Circle(double x){
        this(x, 0, 10);
    }

    public Circle(double x, double y){
        this(x);
        this.center_y = y;
        this.radius = 10;
    }


    void presentMySelf()
    {
        // TODO: this keyword here
        System.out.println("My center_x is: " + this.center_x);
        System.out.println("My center_y is: " + this.center_y);
        System.out.println("My perimeter is" + this.perimeter());
        System.out.println("My area is" + this.area());
    }

    // TODO: this keyword here
    double perimeter()
    {
        sayHello();
        return 2 * Math.PI * radius;
    }

    double area()
    {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args){
        Circle d = new Circle(1, 2, 3);
        d.Circle(1, 2, 3);
        d.sayHello();
    }
}
