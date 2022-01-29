package sti.abstractions.domain;

import java.util.List;
import java.util.Random;

public class PineTree {

    private int numOfCones;

    private List<Squirrel> squirrels;

    private Owl owl;

    private int age;

    private int height;

    //constructor
    public PineTree(int numOfCones, List<Squirrel> squirrels, Owl owl, int age, int height) {
        this.numOfCones = numOfCones;
        this.squirrels = squirrels;
        this.owl = owl;
        this.age = age;
        this.height = height;
    }

    public int getNumOfCones() {
        return numOfCones;
    }

    public void setNumOfCones(int numOfCones) {
        this.numOfCones = numOfCones;
    }

    public List<Squirrel> getSquirrels() {
        return squirrels;
    }

    public void setSquirrels(List<Squirrel> squirrels) {
        this.squirrels = squirrels;
    }

    public Owl getOwl() {
        return owl;
    }

    public void setOwl(Owl owl) {
        this.owl = owl;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {return height;}

    public void setHeight(int height) {this.height = height;}

    public boolean fall(int height, int age, int earthquake){
        if (age > 600 && height > 30 && earthquake > 3){
            Random random = new Random();
            return random.nextInt(6) >= 4;
        }
        return false;
    }

    static class PineCone{

    }
}
