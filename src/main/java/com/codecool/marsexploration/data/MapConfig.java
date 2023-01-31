package com.codecool.marsexploration.data;

public class MapConfig {
    private final int height;
    private final int width;
    private final int noOfMtns;
    private final int noOfPits;

    public MapConfig(int height, int width, int noOfMtns, int noOfPits) {
        this.height = height;
        this.width = width;
        this.noOfMtns = noOfMtns;
        this.noOfPits = noOfPits;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getLogPath() {
        return Data.LOG_PATH;
    }

    public int getNoOfMtns() {
        return noOfMtns;
    }

    public int getNoOfPits() {
        return noOfPits;
    }
}
