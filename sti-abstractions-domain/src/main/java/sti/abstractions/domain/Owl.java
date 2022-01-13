package sti.abstractions.domain;

public class Owl extends Animal {

    private int wingSpan;


    public Owl(String name, int wingSpan, boolean isHungry, double weight) {
        this.name = name;
        this.wingSpan = wingSpan;
        this.isHungry = isHungry;
        this.weight = weight;
    }

    public void eat(boolean isHungry){

        if (isHungry){

        }
    }


}


