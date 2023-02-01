package com.codecool.marsexploration.Logic;

import com.codecool.marsexploration.Ui.GetUserInput;
import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.Elements;
import com.codecool.marsexploration.data.Map;

import java.util.*;

public class GeneratePit implements GetUserInput, EmptyProvider, ShapeProvider {

    int numberOfPits;
    private Map baseMap;


    public int getNumberOfPits() {
        return numberOfPits;
    }

    public GeneratePit() {
        this.numberOfPits = promptInput();
    }

    @Override
    public LinkedHashMap<Coordinate, Elements> getEmptyCoords(Coordinate base /*ez amugy sztem lehet h index.*/) {
        LinkedHashMap<Coordinate, Elements> gameMap = baseMap.getMap();
        LinkedHashMap<Coordinate, Elements> emptyShape = new LinkedHashMap<>();
        List<Coordinate> coordinates = (List<Coordinate>) gameMap.keySet();
        for (int i = 0; i < gameMap.size(); i++) {
            if (Objects.equals(gameMap.get(i), Elements.EMPTY)) {
                emptyShape.put(coordinates.get(i), gameMap.get(i));
            }
        }
        return emptyShape;
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
        LinkedHashMap<Coordinate,Elements> emptyCoords = getEmptyCoords(base);
        Random random = new Random();
        int randIndex;
        List<Coordinate> coordinates = (List<Coordinate>) baseMap.getMap().keySet();

        for (int i = 0; i < shapeSize; i++) {
            randIndex = random.nextInt(emptyCoords.size());
            Coordinate coordinate = coordinates.get(randIndex);
            if(emptyCoords.get(coordinate).equals(Elements.EMPTY)){
                emptyCoords.replace(coordinate,Elements.EMPTY,Elements.PIT);
            }
        }
    }
}
