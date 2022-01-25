package sti.abstractions.dao;

import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

import java.sql.*;
import java.util.List;

public class ForestDaoImpl implements ForestDao{

    Connection conn = null;
    PreparedStatement preparedStatement = null;
    ResultSet rs = null;
    int result = 0;

    @Override
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/stidb", "sti","sti");
    }

    @Override
    public Owl createOwl(int wingSpan, boolean hungry, int weight, String name) {
        return null;
    }

    @Override
    public Squirrel createSquirrel(String name, int weight) {
        try {
            conn = getConnection();
            preparedStatement =conn.prepareStatement("INSERT INTO squirrel (name, weight) VALUES(?, ?)");

            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, weight);


            result = preparedStatement.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }

        return new Squirrel(name, weight);
    }

    @Override
    public PineTree createPineTree(int numOfCones, List<Squirrel> squirrels, Owl owl, int age) {
        return null;
    }
}
