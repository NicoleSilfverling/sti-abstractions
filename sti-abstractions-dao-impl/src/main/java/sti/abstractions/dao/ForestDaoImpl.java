package sti.abstractions.dao;

import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

import java.util.List;

public class ForestDaoImpl implements ForestDao{
    @Override
    public Owl createOwl(int wingSpan, boolean hungry, int weight, String name) {
        return null;
    }

    @Override
    public Squirrel createSquirrel(String name, boolean isHungry, double weight) {
        return null;
    }

    @Override
    public PineTree createPineTree(int numOfCones, List<Squirrel> squirrels, Owl owl, int age) {
        return null;
    }
}
