package sti.abstractions.service;

import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

import java.util.List;

public interface ForestService {

    Owl createOwl(int wingSpan, boolean hungry, int weight, String name);

    Squirrel createSquirrel(String name, boolean isHungry, double weight);

    PineTree createPineTree(int numOfCones, List<Squirrel> squirrels, Owl owl, int age);






}
