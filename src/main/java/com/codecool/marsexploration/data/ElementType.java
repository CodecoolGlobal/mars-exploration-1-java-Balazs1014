package com.codecool.marsexploration.data;

public enum ElementType {
    PIT('#'),
    MOUNTAIN('^'),
    WATER('~'),
    MINERAL('*'),
    EMPTY(' ');

    final char value;

    ElementType(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
