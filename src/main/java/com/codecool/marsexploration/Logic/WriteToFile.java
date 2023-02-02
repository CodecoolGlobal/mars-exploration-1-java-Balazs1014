package com.codecool.marsexploration.Logic;

import com.codecool.marsexploration.data.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;

public class WriteToFile {

    MapConfig config;

    public WriteToFile(MapConfig config) {
        this.config = config;
    }

    public void printMapToConsole(LinkedHashMap<Coordinate, ElementType> map) {
        for (int x = 0; x < this.config.getWidth(); x++) {
            for (int y = 0; y < this.config.getHeight(); y++) {
                System.out.print(map.get(new Coordinate(x,y)).getValue());
            }
            System.out.println();
        }
    }

    public void saveMapToFile(LinkedHashMap<Coordinate, ElementType> map, String fileName) throws IOException {
        FileWriter writer = new FileWriter(Data.LOG_PATH + fileName + ".txt");
        for (int i = 0; i < this.config.getHeight(); i++) {
            for (int j = 0; j < this.config.getWidth(); j++) {
                writer.write(map.get(new Coordinate(i,j)).getValue());
            }
            writer.write("\n");
        }
        writer.close();
    }
}
