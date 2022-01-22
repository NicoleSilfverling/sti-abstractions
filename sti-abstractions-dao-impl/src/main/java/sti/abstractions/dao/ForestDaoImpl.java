package sti.abstractions.dao;

import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ForestDaoImpl implements ForestDao{

    Connection connection = null;
    Statement statement = null;

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/stidb", "sti","sti");
    }


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