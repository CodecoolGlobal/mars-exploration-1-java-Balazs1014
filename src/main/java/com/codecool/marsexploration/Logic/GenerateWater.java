package com.codecool.marsexploration.Logic;

import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.ElementType;
import com.codecool.marsexploration.data.Map;
import com.codecool.marsexploration.data.MapConfig;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

public class GenerateWater {
    MapConfig mapconfig;
    Map map;
    ElementType type;

    LinkedHashMap<Coordinate, ElementType> mapWithLandscape;
    ElementType parentTerrainElement;

    public GenerateWater(MapConfig mapconfig, Map map, LinkedHashMap<Coordinate, ElementType> mapWithLandscape, ElementType type, ElementType parentTerrainElement) {
        this.mapconfig = mapconfig;
        this.map = map;
        this.mapWithLandscape = mapWithLandscape;
        this.type = type;
        this.parentTerrainElement = parentTerrainElement;
    }

    public Coordinate getOneEmptyCoordinate(Coordinate base) {

        for (int x = base.x() - 1; x < base.x() + 1; x++) {
            for (int y = base.y() - 1; y < base.y() + 1; y++) {
                Coordinate temp = new Coordinate(x, y);
                if (map.getMapCoordinate(temp) == ElementType.EMPTY) {
                    return temp;
                }
            }
        }
        return null;
    }

    private int randomSizeGenerator() {
        Random rand = new Random();
        return rand.nextInt(2, 9);
    }

    private List<Coordinate> getAllPits() {
        List<Coordinate> coordinates = mapWithLandscape.keySet().stream().toList();
        List<ElementType> types = mapWithLandscape.values().stream().toList();
        List<Coordinate> shapeList = new ArrayList<>();
        for (int i = 0; i < types.size(); i++) {
            if(types.get(i).equals(parentTerrainElement)) {
                shapeList.add(coordinates.get(i));
            }

        }
        return shapeList;
    }

    private Coordinate basePit() {
        List<Coordinate> pits = getAllPits();
        Random rand = new Random();
        return pits.get(rand.nextInt(pits.size()));
    }

    private void createWater(Coordinate emptyCoord) {
        map.setCoordinateElement(emptyCoord, this.type);
    }

    public void generateFullWater() {
        int shapeSize = randomSizeGenerator();
        int counter = 0;
        while (counter < shapeSize) {
            counter++;
            Coordinate base = basePit();
            Coordinate valid = getOneEmptyCoordinate(base);
            createWater(valid);
        }
    }

}
