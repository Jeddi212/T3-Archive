// Nama : Jedeiah Fanuel
// Nim : 1119023
package com.jedediah;

import java.util.ArrayList;

public class Main {

    static void hardCode() {
        Cat cat1 = new Cat("Kitty",2,"Fish","Female",1);
        Cat cat2 = new Cat("Max",4,"Chicken","Male",0);
        Dog dog1 = new Dog("Dogo",3.5,"Carrot","Male",1);
        Dog dog2 = new Dog("Lexy",2.2,"Rice","Male",1);
        Duck duck1 = new Duck("Donald",1,"Bean","Female",1);
        Duck duck2 = new Duck("Mickey",0.7,"Leaf","Male",0);
        Horse horse1 = new Horse("Rocky",8,"Grass","Female",1);
        Horse horse2 = new Horse("Blacky",9.8,"Apple","Female",1);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(dog1);
        animals.add(dog2);
        animals.add(duck1);
        animals.add(duck2);
        animals.add(horse1);
        animals.add(horse2);

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).printData(animals.get(i)));
        }
    }

    public static void main(String[] args) {
        System.out.println("Latihan Animal \n");

        hardCode();

    }
}
