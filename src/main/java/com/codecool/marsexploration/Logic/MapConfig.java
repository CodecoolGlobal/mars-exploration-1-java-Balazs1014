package com.codecool.marsexploration.Logic;

public class MapConfig {
    private final int height;
    private final int width;
    private final String logPath;
    private final int noOfMtns;
    private final int noOfPits;

    public MapConfig(int height, int width, String logPath, int noOfMtns, int noOfPits) {
        this.height = height;
        this.width = width;
        this.logPath = logPath;
        this.noOfMtns = noOfMtns;
        this.noOfPits = noOfPits;
    }
}
