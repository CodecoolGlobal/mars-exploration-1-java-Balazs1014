package com.codecool.marsexploration.data;

public enum Elements {
    PIT("#"),
    MOUNTAIN("^"),
    WATER("~"),
    MINERAL("*"),
    EMPTY(" ");

    String value;

    Elements(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
