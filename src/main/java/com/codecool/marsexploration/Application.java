package com.codecool.marsexploration;

import com.codecool.marsexploration.Logic.DinamicNaming;
import com.codecool.marsexploration.Logic.FinalMapGeneration;
import com.codecool.marsexploration.Logic.GenerateLandscape;
import com.codecool.marsexploration.Logic.WriteToFile;
import com.codecool.marsexploration.Ui.GetUserInput;
import com.codecool.marsexploration.data.ElementType;
import com.codecool.marsexploration.data.Map;
import com.codecool.marsexploration.data.MapConfig;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        GetUserInput input = new GetUserInput();
        input.promptInput();
        MapConfig config = new MapConfig(input);
        FinalMapGeneration whatMarsLooksLike = new FinalMapGeneration();
        whatMarsLooksLike.generateFullTerrainViewOfMars(config);




    }
}
