package com.company.breakpoint;

public class CallByValue {

    public int attribute;

    public void function()
    {
        System.out.println("Do something in CallByValue");
    }
    // pass by value
    static void swapValues(int a, int b)
    {
        int c = a;
        a = b;
        b = c;
    }

    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        swapValues(a, b);
        System.out.println(a + " " + b);
    }


}
