package sti.abstractions.service;

import sti.abstractions.domain.Owl;
import sti.abstractions.domain.Squirrel;

public interface ForestService {

    public Owl createOwl(int wingSpan);

    public Squirrel createSquirrel(String name, boolean isHungry,  double weight);


}
