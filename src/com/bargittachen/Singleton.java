package com.bargittachen;

/**
 * Created by xichen on 8/12/14.
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton Instance(){
        return singleton;
    }
}


