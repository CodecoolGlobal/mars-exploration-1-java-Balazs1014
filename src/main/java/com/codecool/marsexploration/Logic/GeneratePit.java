package com.codecool.marsexploration.Logic;

import com.codecool.marsexploration.Ui.GetUserInput;
import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.Elements;
import com.codecool.marsexploration.data.Map;

import java.util.*;

public class GeneratePit implements GetUserInput, EmptyProvider, ShapeProvider {

    int numberOfPits;
    private Map baseMapMap;

    public int getNumberOfPits() {
        return numberOfPits;
    }

    public GeneratePit() {
        this.numberOfPits = promptInput();
    }

    @Override
    public LinkedHashMap<Coordinate, Elements> getEmptyCoords(Coordinate base /*ez amugy sztem lehet h index.*/) {
        int basex = base.x();
        int basey = base.y();
        var originalMap = baseMapMap.getMap();
       LinkedHashMap<Coordinate,Elements> emptyShape = new LinkedHashMap<>();
        for(int i =0; i< originalMap.size(); i++){
            //basex ++;
           if(!Objects.equals(originalMap.get(base) , Elements.EMPTY)){
              originalMap.remove();
             // emptyShape.put(originalMap.keySet().stream().reduce();
           }
        }

        /*LinkedHashMap<Coordinate,Elements> emptyShape = new LinkedHashMap<>();

        for (base.)*/
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
