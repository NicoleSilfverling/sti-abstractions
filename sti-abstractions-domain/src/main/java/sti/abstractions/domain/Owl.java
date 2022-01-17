package sti.abstractions.domain;

public class Owl extends Animal {

    private int wingSpan;


    public Owl(String name, int wingSpan, boolean isHungry, double weight) {
        this.name = name;
        this.wingSpan = wingSpan;
        this.isHungry = isHungry;
        this.weight = weight;
    }

    private static final int DEFAULT_WINGSPAN = 90;

    public Owl(int wingSpan){
        setWingSpan(wingSpan);
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        if(wingSpan >=75 && wingSpan <= 110) {
            this.wingSpan = wingSpan;
        }else{
            this.wingSpan = DEFAULT_WINGSPAN;
        }
    }

    public void eat(boolean isHungry){

        if (isHungry){

        }
    }


}


