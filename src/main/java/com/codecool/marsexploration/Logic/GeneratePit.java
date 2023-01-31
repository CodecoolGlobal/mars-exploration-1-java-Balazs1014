package com.codecool.marsexploration.Logic;

import com.codecool.marsexploration.Ui.GetUserInput;
import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.Elements;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class GeneratePit implements GetUserInput, EmptyProvider, ShapeProvider {

    int numberOfPits;

    public int getNumberOfPits() {
        return numberOfPits;
    }

    public GeneratePit() {
        this.numberOfPits = promptInput();
    }

    @Override
    public LinkedHashMap<Coordinate, Elements> getEmptyCoords(Coordinate base) {
        return null;
    }

    //  mountains (more than 1 mountain connected) shape size (int)
    // base coordinate (Coordinate)




    @Override
    public int promptInput() {
        System.out.println("How many pits to generate?");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    @Override
    public void createShape(int shapeSize, Coordinate base) {

    }
}
