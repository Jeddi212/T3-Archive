package com.jedediah;

public abstract class Animal implements InterfaceHidup{
    String name;
    double age;
    String food;
    String gender;
    int alive;

    public Animal(){}

    public Animal(String name, double age, String food, String gender, int alive) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.alive = alive;
    }

    abstract String printSound();

    @Override
    public boolean isAlive(int alive) {
        return alive != Dead;
    }

    String printData(Animal animals) {
        boolean isAlive = isAlive(alive);
        String isClass;

        if (animals instanceof Cat) {
            isClass = "Cat";
        } else if (animals instanceof Dog) {
            isClass = "Dog";
        } else if (animals instanceof Duck) {
            isClass = "Duck";
        } else if (animals instanceof Horse) {
            isClass = "Horse";
        } else {
            isClass = "Unknown Creature";
        }

        return "- Data of Animal -\n" +
                "Type   : " + isClass + "\n" +
                "Name   : " + name + "\n" +
                "Age    : " + age + "\n" +
                "Food   : " + food + "\n" +
                "Gender : " + gender + "\n" +
                "Alive  : " + isAlive + "\n";
    }

}
