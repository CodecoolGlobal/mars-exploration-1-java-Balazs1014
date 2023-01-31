package com.codecool.marsexploration.Logic;

import com.codecool.marsexploration.Ui.GetUserInput;
import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.Elements;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class GenerateMtn implements GetUserInput, EmptyProvider, ShapeProvider {

    int numberOfMountainGroups;

    public int getNumberOfMountainGroups() {
        return numberOfMountainGroups;
    }

    public GenerateMtn() {
        this.numberOfMountainGroups = promptInput();
    }

    @Override
    public LinkedHashMap<Coordinate, Elements> getEmptyCoords(Coordinate base) {
        return null;
    }



    @Override
    public int promptInput() {
        System.out.println("How many mountains to generate?");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    @Override
    public void createShape(int shapeSize, Coordinate base) {

    }

}
