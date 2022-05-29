package com.Observer;

public class Subscriber {

    private String name;
    private Channel channel = new Channel();

    public void update() {
        System.out.println("Hey " + name + " Video Uploaded : " + channel.title);
    }

    public void subscribeChannel(Channel channel) {
        this.channel = channel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subscriber(String name) {
        this.name = name;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}
