package com.codecool.marsexploration.Logic;

import java.util.Random;

public class DinamicNaming {
    public DinamicNaming(String fileName) {
        this.fileName = fileName;
    }

    private String fileName;
    private int filenamenumber = 0;
    String generatedName;
    public String generateName(){
       /* for (int i = 0; i < 100; i++) {
            generatedName = fileName + i;
        }*/
       // Random random = new Random();
         filenamenumber++;
        generatedName = fileName+ filenamenumber ;
        return generatedName;
    }


}
