package com.codecool.marsexploration.Ui;

import java.util.Scanner;

public class GetUserInput {

    private int size;
    private int noOfMTN;
    private int noOfPit;
    private String fileName;

    public int getNoOfMTN() {
        return noOfMTN;
    }

    public int getNoOfPit() {
        return noOfPit;
    }

    public String getFileName() {
        return fileName;
    }

    public int getSize() {
        return size;
    }

    public void promptInput() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter map configuration \n File name for output \n Size of map \n Number of mountain groups \n Number of pit groups \n thanks");

        fileName = myObj.nextLine();
        size = myObj.nextInt();
        noOfMTN = myObj.nextInt();
        noOfPit = myObj.nextInt();
    }
}
