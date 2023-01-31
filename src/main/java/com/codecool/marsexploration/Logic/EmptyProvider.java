package com.codecool.marsexploration.Logic;

import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.Elements;

import java.util.LinkedHashMap;
import java.util.List;

public interface EmptyProvider {
    LinkedHashMap<Coordinate, Elements> getEmptyCoords(Coordinate base);

}
