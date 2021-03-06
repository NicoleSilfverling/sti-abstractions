package sti.abstractions.dao;

import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface ForestDao {
    Owl createOwl(int wingSpan, boolean hungry, int weight, String name);

    Squirrel createSquirrel(String name, int weight);

    PineTree createPineTree(int numOfCones, List<Squirrel> squirrels, Owl owl, int age);

    Connection getConnection() throws SQLException;
}
