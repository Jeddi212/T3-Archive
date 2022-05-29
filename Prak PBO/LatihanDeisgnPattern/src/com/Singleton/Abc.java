package com.Singleton;

public class Abc {
    static Abc obj;

    private Abc() {
        System.out.println("Instance Created");
    }

    public static Abc getInstance() {

//        if (obj == null) {
            obj = new Abc();
//        }
        return obj;

    }
}

