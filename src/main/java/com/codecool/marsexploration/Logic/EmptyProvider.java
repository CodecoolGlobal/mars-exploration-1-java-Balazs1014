package com.codecool.marsexploration.Logic;

import com.codecool.marsexploration.data.Coordinate;

import java.util.List;

public interface EmptyProvider {
    List<Coordinate> getEmptyCoords(Coordinate base);
}
