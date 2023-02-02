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

    //2kezdő pont körül kellenek az üres helyek
    @Override
    public List<Coordinate> getEmptyCoords(Coordinate base) {
        result = new ArrayList<>();
        for (int x = base.x() - 1; x < base.x() + 1; x++) {
            for (int y = base.y() - 1; y < base.y() + 1; y++) {
                Coordinate temp = new Coordinate(x, y);
                System.out.println("X : " + temp.x());
                System.out.println("Y : " + temp.y());
                if (map.getMapCoordinate(temp).equals(ElementType.EMPTY)) {
                    this.result.add(temp);
                }
            }
        }
        return result;
    }
    @Override
    public int sizeRNG() {
        /*Random rand = new Random();
        return rand.nextInt(5, 20);*/
        return 5;
    }

    //1kezdő pointot megadni
    private Coordinate baseRNG() {
        Random rand = new Random();
        return new Coordinate(rand.nextInt(1,mapconfig.getSize()), rand.nextInt(1,mapconfig.getSize()));
    }

    //3 resultba benne a random base körüli üres helyek [üreskord, üreskord...], azért adom a firstot vissza mert az lesz az uj base, triuggereli a get emptyt és igy dinamikus nem jo a get0
    private Coordinate createTerrain(List<Coordinate> emptyCoords) {
        Random random = new Random();
        int randNumber = random.nextInt(emptyCoords.size());
        Coordinate first = emptyCoords.get(randNumber);
        map.setCoordinateElement(first, this.type);
        return first;
    }

    // 4ez meg berobbantja
    public void initTerrain() {
        int MTNsize = sizeRNG();
        int counter = 0;
        Coordinate base = baseRNG();
        while (counter < MTNsize) {
            counter++;
            base = createTerrain(getEmptyCoords(base));
        }
    }
}
