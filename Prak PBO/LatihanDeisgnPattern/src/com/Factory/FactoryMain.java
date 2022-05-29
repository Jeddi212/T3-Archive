package com.Factory;

import com.Factory.Phone.*;

public class FactoryMain {

    public static void main(String[] args) {

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Open");
        obj.spec();

        OS obj2 = osf.getInstance("Close");
        obj2.spec();

        OS obj3 = osf.getInstance("ansaudhas");
        obj3.spec();

    }

}
