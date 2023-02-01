package com.codecool.marsexploration.Logic;

import com.codecool.marsexploration.Ui.GetUserInput;
import com.codecool.marsexploration.data.ElementType;
import com.codecool.marsexploration.data.Map;
import com.codecool.marsexploration.data.MapConfig;

import java.io.IOException;
import java.util.Scanner;

public class FinalMapGeneration  {
    public void generateFullTerrainViewOfMars(MapConfig mapConfig) throws IOException {

        DinamicNaming name = new DinamicNaming(mapConfig.getFileName());
        String generateName = name.generateName();
        Map map = new Map(mapConfig);
        WriteToFile toFile = new WriteToFile(mapConfig);
        GenerateLandscape generateMountains = new GenerateLandscape(mapConfig,map, ElementType.MOUNTAIN);
        GenerateLandscape generatePit = new GenerateLandscape(mapConfig, map,ElementType.PIT);
        for (int i = 0; i < mapConfig.getNoOfMtns() ; i++) {
            generateMountains.generateFullTerrain();
        }
        for (int i = 0; i < mapConfig.getNoOfPits() ; i++) {
            generatePit.generateFullTerrain();
        }
        toFile.saveMapToFile(map.getMap(),generateName);
        toFile.printMapToConsole(map.getMap());
    }



}
