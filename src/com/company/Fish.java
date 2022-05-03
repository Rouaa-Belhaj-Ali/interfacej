package com.company;

public class Fish implements Prey,Predator{
    @Override
   public void eat(){
        System.out.println("fis is eating");
    }

    @Override
    public void hunt() {
        System.out.println("");

    }
}
