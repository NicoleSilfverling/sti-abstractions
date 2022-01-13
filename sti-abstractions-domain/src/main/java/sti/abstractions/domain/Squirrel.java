package sti.abstractions.domain;

public class Squirrel extends Animal{

    private int numOfConesInNest;

    public Squirrel(String name, boolean isHungry, double weight) {
        this.name = name;
        this.isHungry = isHungry;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfConesInNest() {
        return numOfConesInNest;
    }

    public void setNumOfConesInNest(int numOfConesInNest) {
        this.numOfConesInNest = numOfConesInNest;
    }


    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    public String eat(boolean isHungry, int numOfConesInNest){
        if (isHungry == true && numOfConesInNest > 0){
            setHungry(false);
            setNumOfConesInNest(getNumOfConesInNest()-1);
            setWeight(getWeight()+0.03);
        }
        return  "Name: " + getName() + "\nNr of cones in nest: " + getNumOfConesInNest() + "\nWeight: " + getWeight();
    }



}
