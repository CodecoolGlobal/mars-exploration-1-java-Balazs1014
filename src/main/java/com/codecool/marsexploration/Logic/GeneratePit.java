package com.codecool.marsexploration.Logic;
import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.Elements;
import com.codecool.marsexploration.data.Map;
import com.codecool.marsexploration.data.MapConfig;


import java.util.*;





public class GeneratePit implements EmptyProvider {

    MapConfig mapconfig;
    Map map;

    public GeneratePit(MapConfig mapconfig, Map map) {
        this.mapconfig = mapconfig;
        this.map = map;
    }
    //2kezdő pont körül kellenek az üres helyek
    @Override
    public List<Coordinate> getEmptyCoords(Coordinate base) {

        List<Coordinate> result = new ArrayList<>();
        for (int x = base.x() - 1; x < base.x() + 1; x++) {
            for (int y = base.y() - 1; y < base.x() + 1; y++) {
                Coordinate temp = new Coordinate(x, y);
                if (map.getMapCoordinate(temp) == Elements.EMPTY) {
                    result.add(temp);
                }
            }
        }
        return result;

        
    }

    private int MtnSizeRNG() {
        Random rand = new Random();
        return rand.nextInt(5, 20);
    }

    //1kezdő pointot megadni
    private Coordinate baseRNG() {
        Random rand = new Random();
        return new Coordinate(rand.nextInt(mapconfig.getHeight()), rand.nextInt(mapconfig.getWidth()));
    }

    //3 resultba benne a random base körüli üres helyek [üreskord, üreskord...], azért adom a firstot vissza mert az lesz az uj base, triuggereli a get emptyt és igy dinamikus nem jo a get0
    private Coordinate createMTN(List<Coordinate> emptyCoords) {
        Coordinate first = emptyCoords.get(0);
        map.setCoordinateElement(first, Elements.PIT);
        return first;
    }
    // 4ez meg berobbantja
    public void initGenerateMTN() {
        int MTNsize = MtnSizeRNG();
        int counter = 0;
        Coordinate base = baseRNG();
        while (counter != MTNsize) {
            counter++;
            base = createMTN(getEmptyCoords(base));
        }
    }
}
