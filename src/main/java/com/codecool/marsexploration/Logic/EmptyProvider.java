package com.codecool.marsexploration.Logic;

import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.Elements;

import java.util.LinkedHashMap;
import java.util.List;

public interface EmptyProvider {
    List<Coordinate> getEmptyCoords(Coordinate base);

}
