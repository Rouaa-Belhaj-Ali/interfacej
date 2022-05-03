package com.company;

public class Main {

    public static void main(String[] args) {

        //initiate instances of classes
        Rabbit rabbit = new Rabbit("Bugs Bunny");
        Tiger tiger = new Tiger();
        Fish fish = new Fish();
        fish.eat();
        tiger.hunt();
        fish.hunt();
        rabbit.eat();

    }
}
