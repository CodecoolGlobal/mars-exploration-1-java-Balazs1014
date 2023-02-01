package com.codecool.marsexploration.data;

import com.codecool.marsexploration.Logic.EmptyProvider;
import com.codecool.marsexploration.Logic.ShapeProvider;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Pit implements EmptyProvider, ShapeProvider {

    @Override
    public List<Coordinate> getEmptyCoords(Coordinate base) {
        /*
        List<Coordinate> emptyCoords = new ArrayList<>();
        Coordinate left = new Coordinate(base.x() - 1, base.y());
        Coordinate right = new Coordinate(base.x() + 1, base.y());
        Coordinate up = new Coordinate(base.x(), base.y() + 1);
        Coordinate down = new Coordinate(base.x(), base.y() - 1);
        // Diagonal
        Coordinate leftUp = new Coordinate(base.x() - 1, base.y() + 1);
        Coordinate rightUp = new Coordinate(base.x() + 1, base.y() + 1);
        Coordinate leftDown = new Coordinate(base.x() - 1, base.y() - 1);
        Coordinate rightDown = new Coordinate(base.x() + 1, base.y() - 1);
        */
        return null;
    }

    @Override
    public void createShape(int shapeSize, Coordinate base) {

    }
}
