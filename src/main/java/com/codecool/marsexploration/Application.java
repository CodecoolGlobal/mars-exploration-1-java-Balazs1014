package com.codecool.marsexploration;

import com.codecool.marsexploration.Logic.WriteToFile;
import com.codecool.marsexploration.data.Map;
import com.codecool.marsexploration.data.MapConfig;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        MapConfig mapConfig = new MapConfig(32,32,10,10);
        Map map = new Map(mapConfig);
        WriteToFile toFile = new WriteToFile(mapConfig);
        toFile.printMapToConsole(map.getMap());
    }
}
