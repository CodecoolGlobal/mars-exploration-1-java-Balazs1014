package com.codecool.marsexploration.data;

import java.util.LinkedHashMap;

public class Map {
    private MapConfig config;
    private LinkedHashMap <Coordinate, ElementType> map = new LinkedHashMap<>();

    public Map(MapConfig config) {
        this.config = config;
        generateMap();
    }

    public LinkedHashMap<Coordinate, ElementType> getMap() {
        return this.map;
    }
    //elementet adok vissza mert abbol látom h mi van azon a kordon
    public ElementType getMapCoordinate(Coordinate coordinate) {
        return map.get(coordinate);
    }

    public void setCoordinateElement(Coordinate coordinate, ElementType element) {
        map.put(coordinate, element);
    }

    private void generateMap() {
        int width = this.config.getWidth();
        int height = this.config.getHeight();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                this.map.put(new Coordinate(x,y), ElementType.EMPTY);
            }
        }
    }
}
