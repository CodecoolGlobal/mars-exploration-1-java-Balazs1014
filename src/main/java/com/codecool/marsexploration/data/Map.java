package com.codecool.marsexploration.data;

import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.Elements;

import javax.lang.model.element.Element;
import java.util.LinkedHashMap;

public class Map {
    private final MapConfig config;
    private final LinkedHashMap <Coordinate, Elements> map = new LinkedHashMap<>();

    public Map(MapConfig config) {
        this.config = config;
        generateMap();
    }

    public LinkedHashMap<Coordinate, Elements> getMap() {
        return map;
    }
    //elementet adok vissza mert abbol látom h mi van azon a kordon
    public Elements getMapCoordinate(Coordinate coordinate) {
        return map.get(coordinate);
    }

    public void setCoordinateElement(Coordinate coordinate, Elements element) {
        map.put(coordinate, element);
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
