package com.codecool.marsexploration.Ui;

import com.codecool.marsexploration.data.MapConfig;

import java.util.Scanner;

public class GetUserInput {
    int height;
    int width;
    int noOfMTN;
    int noOfPit;
    String fileName;
    MapConfig config;

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
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter map configuration\nFile name for output \n Height \n Width of map \n Number of mountain groups \n Number of pit groups \n thanks");

        fileName = myObj.nextLine();
         height = myObj.nextInt();
         width = myObj.nextInt();
         noOfMTN = myObj.nextInt();
         noOfPit = myObj.nextInt();


        //String userName = myObj.nextLine(); // Read user input
         // Output user input

    }
}
