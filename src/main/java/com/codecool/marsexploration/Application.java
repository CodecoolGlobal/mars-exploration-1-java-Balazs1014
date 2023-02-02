package com.codecool.marsexploration;

import com.codecool.marsexploration.Logic.MapGenerator;
import com.codecool.marsexploration.Ui.GetUserInput;
import com.codecool.marsexploration.data.MapConfig;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        GetUserInput input = new GetUserInput();
        input.promptInput();
        MapConfig config = new MapConfig(input);
        MapGenerator whatMarsLooksLike = new MapGenerator();
        whatMarsLooksLike.generateFullTerrainViewOfMars(config);
    }
}
