package sti.abstractions.domain;

public abstract class Animal {

    protected boolean hungry;

    protected int weight;

    protected String name;

    public Animal(){}

    public Animal(boolean hungry, int weight, String name) {
        this.hungry = hungry;
        this.weight = weight;
        this.name = name;
    }
    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract boolean eat(Object food);
}
