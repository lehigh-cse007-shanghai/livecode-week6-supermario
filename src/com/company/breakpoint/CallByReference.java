package com.company.supermario;

class DataClass
{
    int value;
}

public class CallByReference {

    void swapValues(DataClass a, DataClass b)
    {
        int tmp;
        tmp = a.value;
        a.value = b.value;
        b.value = tmp;
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
