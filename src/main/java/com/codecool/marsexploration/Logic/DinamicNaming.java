package com.codecool.marsexploration.Logic;

import java.util.Random;

public class DinamicNaming {
    private String fileName = "our_map";
    private int filenamenumber = 0;
    String generatedName;
    public String generateName(){
       /* for (int i = 0; i < 100; i++) {
            generatedName = fileName + i;
        }*/
       // Random random = new Random();
        generatedName = fileName ;
        return generatedName + filenamenumber++;
    }


}
