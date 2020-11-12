package com.company.pattern;

public class Singleton {
    private int value = 0;
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        value++;
    }

    public int TimeFive(int b){
        return 5*b;
    }

    public int getValue() {
        return value;
    }

    public static Singleton getInstance()
    {   return INSTANCE;
    }

}
