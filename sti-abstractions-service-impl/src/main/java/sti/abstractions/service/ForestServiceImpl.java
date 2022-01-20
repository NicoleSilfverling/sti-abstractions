package sti.abstractions.service;


import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

import java.util.List;

public class ForestServiceImpl implements ForestService {

    public Owl createOwl(int wingSpan, boolean hungry, int weight, String name) {
        return new Owl(wingSpan, hungry, weight, name);
    }

    @Override
    public Squirrel createSquirrel(String name, boolean isHungry, double weight) {
        return null;
    }

    @Override
    public PineTree createPineTree(int numOfCones, List<Squirrel> squirrels, Owl owl, int age){return null;}



}
