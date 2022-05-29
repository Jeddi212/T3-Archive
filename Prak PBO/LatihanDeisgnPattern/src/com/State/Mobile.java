package com.State;

public class Mobile {

    public static void main(String[] args) {
        MobileContext mobileContext = new MobileContext();
        mobileContext.alert();

        mobileContext.setState(new Silent());
        mobileContext.alert();

        System.out.println("Set too ringing");
        mobileContext.setState(new Ringing());
        mobileContext.alert();
    }

}
