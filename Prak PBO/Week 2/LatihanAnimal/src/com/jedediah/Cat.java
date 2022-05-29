package com.jedediah;

public class Cat extends Animal{

    String speak = "Meong";

    public Cat(){}

    public Cat(String name, double age, String food, String gender, int alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    String printSound() {
        return speak;
    }

    @Override
    String printData(Animal animals) {
        String dataAnimal = super.printData(animals);
        String soundData = printSound();
        String sound = "Sound  : " + soundData + "\n";
        return dataAnimal + sound;
    }

}
