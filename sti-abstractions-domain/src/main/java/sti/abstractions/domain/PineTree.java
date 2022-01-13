package sti.abstractions.domain;

import java.util.ArrayList;

public class PineTree {
    private int numOfCones;
    private int height;
    private ArrayList<Squirrel> squirrels = new ArrayList<>();
    private ArrayList<Owl> owls = new ArrayList<>();

    public PineTree(int numOfCones, int height) {
        this.numOfCones = numOfCones;
        this.height = height;
    }

    public ArrayList<Owl> getOwls() {
        return owls;
    }
    public void addOwls(Owl owl){
        owls.add(owl);
    }


    public ArrayList<Squirrel> getSquirrels() {
        return squirrels;
    }
    public void addSquirrels(Squirrel squirrel){
        squirrels.add(squirrel);
    }

    public void printSquirellList(){
        for (Squirrel squirrel: squirrels) {
            System.out.println("Name: " + squirrel.getName() + "\nWeight: " + squirrel.getWeight() +
                    "\nCones in nest: " + squirrel.getNumOfConesInNest() + "\nIs hungry: " + squirrel.isHungry());

        }
    }
}


