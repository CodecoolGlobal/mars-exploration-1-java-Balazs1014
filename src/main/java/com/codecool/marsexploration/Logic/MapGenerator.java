package com.codecool.marsexploration.Logic;

import com.codecool.marsexploration.data.ElementType;
import com.codecool.marsexploration.data.Map;
import com.codecool.marsexploration.data.MapConfig;

import java.io.IOException;

public class MapGenerator {
    public void generateFullTerrainViewOfMars(MapConfig mapConfig) throws IOException {

        DinamicNaming name = new DinamicNaming(mapConfig.getFileName());
        String generateName = name.generateName();
        Map map = new Map(mapConfig);
        WriteToFile toFile = new WriteToFile(mapConfig);
        GenerateLandscape generateMountains = new GenerateLandscape(mapConfig,map, ElementType.MOUNTAIN);
        GenerateLandscape generatePit = new GenerateLandscape(mapConfig, map,ElementType.PIT);
        GenerateResources water = new GenerateResources(mapConfig, map, map.getMap(),ElementType.WATER, ElementType.PIT);
        GenerateResources mineral = new GenerateResources(mapConfig, map, map.getMap(),ElementType.MINERAL, ElementType.MOUNTAIN);

        for (int i = 0; i < mapConfig.getNoOfMtns() ; i++) {
            generateMountains.initTerrain();
        }
        for (int i = 0; i < mapConfig.getNoOfPits() ; i++) {
            generatePit.initTerrain();
        }

        water.initResources();
        mineral.initResources();
        toFile.saveMapToFile(map.getMap(),generateName);
        toFile.printMapToConsole(map.getMap());
    }
}
