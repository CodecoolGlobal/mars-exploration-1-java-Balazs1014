package com.codecool.marsexploration.data;

import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.Elements;
import java.util.LinkedHashMap;

public class Map {
    private final MapConfig config;
    private  LinkedHashMap <Coordinate, Elements> map = new LinkedHashMap<>();

    public Map(MapConfig config) {
        this.config = config;
        generateMap();
    }

    public LinkedHashMap<Coordinate, Elements> getMap() {
        return map;
    }

    private void generateMap() {
        int width = this.config.getWidth();
        int height = this.config.getHeight();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                this.map.put(new Coordinate(x,y), Elements.EMPTY);
            }
        }
    }
}
