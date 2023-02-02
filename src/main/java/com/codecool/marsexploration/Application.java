package com.codecool.marsexploration;

import com.codecool.marsexploration.Logic.MapGenerator;
import com.codecool.marsexploration.Ui.GetUserInput;
import com.codecool.marsexploration.data.MapConfig;
import com.codecool.marsexploration.data.sql.ManageDatabaseClass;

import java.io.IOException;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws IOException, SQLException {
        GetUserInput input = new GetUserInput();
        input.promptInput();
        MapConfig config = new MapConfig(input);
        MapGenerator whatMarsLooksLike = new MapGenerator();
        whatMarsLooksLike.generateFullTerrainViewOfMars(config);
        ManageDatabaseClass db = new ManageDatabaseClass();
        db.connectToDatabase();
    }
}
