package com.codecool.marsexploration.Logic;

import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.Elements;

import java.util.ArrayList;
import java.util.List;

public class EmptyProviderImpl implements EmptyProvider{

    public List<Coordinate> getEmptyCoord(Coordinate base) {
        List<Coordinate> emptyShape = new ArrayList<>();
        int basex = base.x();
        int basey = base.y();

        for (int x = Math.max(basex - 1, 0); x <= Math.min(basex + 1, width - 1); x++) {
            for (int y = Math.max(basey - 1, 0); y <= Math.min(basey + 1, height - 1); y++) {

                if (mainMap.map.get(x).get(y).equals(Elements.EMPTY.getValue())) {
                    emptyShape.add(new Coordinate(x, y));
                }
            }
        }
        return emptyShape;
    }
}
