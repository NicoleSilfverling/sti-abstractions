package sti.abstractions.service;


public class ForestServiceImpl implements ForestService {

    public Owl createOwl(int wingSpan) {
        Owl owl = new Owl(wingSpan);
        return owl;
    }

    @Override
    public Squirrel createSquirrel(String name, boolean isHungry, double weight) {
        return null;
    }
}
