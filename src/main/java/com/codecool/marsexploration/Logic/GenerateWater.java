package com.codecool.marsexploration.Logic;

import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.ElementType;
import com.codecool.marsexploration.data.Map;
import com.codecool.marsexploration.data.MapConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateWater implements EmptyProvider{
    MapConfig mapconfig;
    Map map;

    ElementType type;
    List<Coordinate> result;

    public GenerateWater(MapConfig mapconfig, Map map, ElementType type) {
        this.mapconfig = mapconfig;
        this.map = map;
        this.type = type;
        this.result = new ArrayList<>();

    }

    @Override
    public List<Coordinate> getEmptyCoords(Coordinate base) {

        for (int x = base.x() - 1; x < base.x() + 1; x++) {
            for (int y = base.y() - 1; y < base.y() + 1; y++) {
                Coordinate temp = new Coordinate(x, y);
                if (map.getMapCoordinate(temp) == ElementType.EMPTY) {
                    this.result.add(temp);
                }
            }
        }
        return result;
    }

    private int MtnSizeRNG() {
        Random rand = new Random();
        return rand.nextInt(5, 20);
    }

    private Coordinate baseRNG() {
        Random rand = new Random();
        return new Coordinate(rand.nextInt(mapconfig.getHeight()), rand.nextInt(mapconfig.getWidth()));
    }

    private Coordinate createMTN(List<Coordinate> emptyCoords) {
        Random random = new Random();
        int randNumber = random.nextInt(emptyCoords.size());
        Coordinate first = emptyCoords.get(randNumber);
        map.setCoordinateElement(first, this.type);
        return first;
    }

    public void initGenerateMTN() {
        int MTNsize = MtnSizeRNG();
        int counter = 0;
        Coordinate base = baseRNG();
        while (counter < MTNsize) {
            counter++;
            base = createMTN(getEmptyCoords(base));
        }
    }
}
