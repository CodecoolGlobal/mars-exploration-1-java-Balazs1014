package com.codecool.marsexploration.Ui;

import java.util.Scanner;

public class GetUserInput {
    int height;
    int width;
    int noOfMTN;
    int noOfPit;
    String fileName;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getNoOfMTN() {
        return noOfMTN;
    }

    public int getNoOfPit() {
        return noOfPit;
    }

    public String getFileName() {
        return fileName;
    }

    public void promptInput() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter map configuration \n File name for output \n Height \n Width of map \n Number of mountain groups \n Number of pit groups \n thanks");

        fileName = myObj.nextLine();
        height = myObj.nextInt();
        width = myObj.nextInt();
        noOfMTN = myObj.nextInt();
        noOfPit = myObj.nextInt();
    }
}
