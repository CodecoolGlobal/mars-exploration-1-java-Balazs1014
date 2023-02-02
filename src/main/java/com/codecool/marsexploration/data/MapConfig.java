package com.codecool.marsexploration.data;

import com.codecool.marsexploration.Ui.GetUserInput;

public class MapConfig  {
    private final int height;
    private final int width;
    private final int noOfMtns;
    private final int noOfPits;
    private String fileName;

    public MapConfig(GetUserInput input) {
        this.height = input.getHeight();
        this.width = input.getWidth();
        this.noOfMtns = input.getNoOfMTN();
        this.noOfPits = input.getNoOfPit();
        this.fileName = input.getFileName();
    }
    public String getFileName() {
        return fileName;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    //getlogpath nem kell
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
