package com.codecool.marsexploration.Logic;

import com.codecool.marsexploration.Ui.GetUserInput;
import com.codecool.marsexploration.data.Coordinate;

import java.util.List;
import java.util.Scanner;

public class GenerateMtn implements GetUserInput, EmptyProvider, ShapeProvider {
    @Override
    public List<Coordinate> getEmptyCoord(Coordinate base) {
        return null;
    }

    @Override
    public void createShape() {

    }

    @Override
    public int promptInput() {
        System.out.println("How many mountains to generate?");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
