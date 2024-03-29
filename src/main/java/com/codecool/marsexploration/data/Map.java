package com.codecool.marsexploration.data;

import java.util.LinkedHashMap;

public class Map {
    private final MapConfig config;
    private final LinkedHashMap <Coordinate, ElementType> map = new LinkedHashMap<>();

    public Map(MapConfig config) {
        this.config = config;
        generateMap();
    }

    public LinkedHashMap<Coordinate, ElementType> getMap() {
        return this.map;
    }

    public ElementType getMapCoordinate(Coordinate coordinate) {
        return map.get(coordinate);
    }

    public void setCoordinateElement(Coordinate coordinate, ElementType element) {
        map.put(coordinate, element);
    }

    private void generateMap() {
        int size = this.config.getSize();
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                this.map.put(new Coordinate(x,y), ElementType.EMPTY);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < config.getSize(); i++) {
            for (int j = 0; j < config.getSize(); j++) {
               sb.append(map.get(new Coordinate(i,j)));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
