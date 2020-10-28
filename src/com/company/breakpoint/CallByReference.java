package com.company.breakpoint;

class DataClass
{
    int value;
}

public class CallByReference {

    void swapValues(DataClass x, DataClass y)
    {
        int tmp;
        tmp = x.value;
        x.value = y.value;
        y.value = tmp;
    }

    public static void main(String[] args)
    {
        DataClass a = new DataClass();
        a.value = 10;
        DataClass b = new DataClass();
        b.value = 20;

        CallByReference cbr = new CallByReference();

        cbr.swapValues(a, b);
        System.out.println(a.value + " " + b.value);
    }


}
