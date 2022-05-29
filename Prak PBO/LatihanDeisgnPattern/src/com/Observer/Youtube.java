package com.Observer;

public class Youtube {

    public static void main(String[] args) {

        Channel channel = new Channel();

        Subscriber s1 = new Subscriber("Jeddi");
        Subscriber s2 = new Subscriber("Feldy");
        Subscriber s3 = new Subscriber("Timothy");
        Subscriber s4 = new Subscriber("Levin");
        Subscriber s5 = new Subscriber("Aristo");

        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);
        channel.subscribe(s4);
        channel.subscribe(s5);

        s1.subscribeChannel(channel);
        s2.subscribeChannel(channel);
        s3.subscribeChannel(channel);
        s4.subscribeChannel(channel);
        s5.subscribeChannel(channel);

        channel.upload("Belajar Design Pattern Sebelum UAS Prak PBO");

    }

}
