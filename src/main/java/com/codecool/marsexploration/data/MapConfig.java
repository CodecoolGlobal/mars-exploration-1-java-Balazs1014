package com.codecool.marsexploration.data;

import com.codecool.marsexploration.Ui.GetUserInput;

import java.util.Scanner;

public class MapConfig implements GetUserInput {
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

    @Override
    public int promptInput() {
        System.out.println("How many mountains to generate?");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
