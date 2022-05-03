package com.company;

public class Rabbit implements Prey{

    String name;

    public Rabbit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println( " Tiger ate " + ""+name  );
    }
}
