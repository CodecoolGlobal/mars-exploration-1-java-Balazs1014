package com.codecool.marsexploration.Logic;

public class DinamicNaming {
    private final String fileName;
    private int filenamenumber = 0;
    String generatedName;
    public DinamicNaming(String fileName) {
        this.fileName = fileName;
    }

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
