package com.Builder;

public class Shop {

    public static void main(String[] args) {

        Phone p = new PhoneBuilder().setOs("Solus").setRam(3).getPhone();
        System.out.println(p.toString());

        p = new PhoneBuilder().setOs("Raspberry Pi").setRam(2).setProcessor("kirin").getPhone();
        System.out.println(p.toString());

    }

}
