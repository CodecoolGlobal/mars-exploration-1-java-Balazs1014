package com.codecool.marsexploration.data;

import com.codecool.marsexploration.Ui.GetUserInput;

public class MapConfig  {
    private final int size;
    private final int noOfMtns;
    private final int noOfPits;
    private final String fileName;

    public MapConfig(GetUserInput input) {
        this.size = input.getSize();
        this.noOfMtns = input.getNoOfMTN();
        this.noOfPits = input.getNoOfPit();
        this.fileName = input.getFileName();
    }

    public int getSize() {
        return size;
    }

    public String getFileName() {
        return fileName;
    }

    public int getNoOfMtns() {
        return noOfMtns;
    }

    public int getNoOfPits() {
        return noOfPits;
    }
}
