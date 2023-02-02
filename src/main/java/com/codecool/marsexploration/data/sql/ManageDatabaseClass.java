package com.codecool.marsexploration.data.sql;

import com.codecool.marsexploration.data.sql.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManageDatabaseClass {
    public void connectToDatabase() throws SQLException {
        String dbName = System.getenv("DATABASE");
        String userName = System.getenv("USERNAME");
        String password = System.getenv("PASSWORD");

        String URL = "jdbc:postgresql://localhost:5432/" + dbName;

        Database database = new Database(
                URL,
                userName,
                password);


        Connection databaseConnection = database.getConnection();
        PreparedStatement preparedStatement = databaseConnection.prepareStatement("SELECT * FROM filenames");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String filename = resultSet.getString("name");
            System.out.println(filename);
        }
    }
}
