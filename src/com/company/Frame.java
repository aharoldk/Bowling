package com.company;

public class Frame {

    private final int firstPine;
    private final int secondPine;

    public Frame(int firstPine, int secondPine) {
        this.firstPine = firstPine;
        this.secondPine = secondPine;
    }

    public int getResult() {
        int result;

        if (firstPine == 10) {
            result = 30;

        } else if ((firstPine + secondPine) == 10) {
            result = firstPine + 10;

        } else {
            result = firstPine + secondPine;
        }

        return result;
    }

    @Override
    public String toString() {
        return firstPine + " " + secondPine;
    }
}
