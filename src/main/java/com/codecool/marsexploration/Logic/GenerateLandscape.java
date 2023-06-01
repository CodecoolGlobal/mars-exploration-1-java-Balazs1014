package com.codecool.marsexploration.Logic;

import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.ElementType;
import com.codecool.marsexploration.data.Map;
import com.codecool.marsexploration.data.MapConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateLandscape implements EmptyProvider, RNGProvider {
    MapConfig mapconfig;
    Map map;
    ElementType type;
    List<Coordinate> result;

    public GenerateLandscape(MapConfig mapconfig, Map map, ElementType type) {
        this.mapconfig = mapconfig;
        this.map = map;
        this.type = type;
        this.result = new ArrayList<>();
    }

    @Override
    public List<Coordinate> getEmptyCoords(Coordinate base) {
        result = new ArrayList<>();
        for (int x = base.x() - 1; x < base.x() + 2; x++) {
            for (int y = base.y() - 1; y < base.y() + 2; y++) {
                Coordinate temp = new Coordinate(x, y);
                if (temp.x() < 0) {
                    temp = new Coordinate(0,temp.y());
                }
                if (temp.x() >= this.mapconfig.getSize()) {
                    temp = new Coordinate(mapconfig.getSize() - 1,temp.y());
                }
                if (temp.y() < 0) {
                    temp = new Coordinate(temp.x(),0);
                }
                if (temp.y() >= this.mapconfig.getSize()) {
                    temp = new Coordinate(temp.x(),mapconfig.getSize() - 1);
                }
                if (map.getMapCoordinate(temp).equals(ElementType.EMPTY)) {
                    this.result.add(temp);
                }
            }
        }
        return result;
    }
    @Override
    public int sizeRNG() {
        Random rand = new Random();
        return rand.nextInt(5, 20);
    }

    private Coordinate baseRNG() {
        Random rand = new Random();
        return new Coordinate(rand.nextInt(1, mapconfig.getSize()), rand.nextInt(1, mapconfig.getSize()));
    }

    private Coordinate createTerrain(List<Coordinate> emptyCoords) {
        Random random = new Random();
        int randNumber =0;
        try {
            randNumber = random.nextInt(emptyCoords.size());
        }catch (IllegalArgumentException e) {
            System.out.println(emptyCoords);
            System.out.println(map);
            throw new RuntimeException("out of bounds");
        }
        Coordinate first = emptyCoords.get(randNumber);
        map.setCoordinateElement(first, this.type);
        return first;
    }

    public void initTerrain() {
        int MTNsize = sizeRNG();
        int counter = 0;
        Coordinate base = baseRNG();
        List<Coordinate> emptyCoords = new ArrayList<>();
        while (counter < MTNsize) {
            counter++;
            emptyCoords.addAll(getEmptyCoords(base));
            base = createTerrain(emptyCoords);
            emptyCoords.remove(base);
        }
    }
}
