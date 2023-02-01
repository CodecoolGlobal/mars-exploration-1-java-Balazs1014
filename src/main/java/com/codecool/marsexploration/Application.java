package com.codecool.marsexploration;

import com.codecool.marsexploration.Logic.GenerateLandscape;
import com.codecool.marsexploration.Logic.GenerateWater;
import com.codecool.marsexploration.Logic.WriteToFile;
import com.codecool.marsexploration.data.ElementType;
import com.codecool.marsexploration.data.Map;
import com.codecool.marsexploration.data.MapConfig;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        MapConfig mapConfig = new MapConfig(32,32,10,10);
        Map map = new Map(mapConfig);
        GenerateLandscape generateMountains = new GenerateLandscape(mapConfig,map, ElementType.MOUNTAIN);
        GenerateLandscape generatePit = new GenerateLandscape(mapConfig, map,ElementType.PIT);
        for (int i = 0; i < mapConfig.getNoOfMtns() ; i++) {
            generateMountains.generateFullTerrain();
        }
        for (int i = 0; i < mapConfig.getNoOfPits() ; i++) {
            generatePit.generateFullTerrain();
        }

        GenerateWater water = new GenerateWater(mapConfig, map, map.getMap(), ElementType.WATER);
        water.generateFullWater();
        WriteToFile toFile = new WriteToFile(mapConfig);
        toFile.saveMapToFile(map.getMap(),"OUR_MAP001");
        toFile.printMapToConsole(map.getMap());
        water.basePit();
    }
}
