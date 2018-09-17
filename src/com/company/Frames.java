package com.company;

public class Frames {

    private final int firstPine;
    private final int secondPine;

    public Frames(int firstPine, int secondPine) {
        this.firstPine = firstPine;
        this.secondPine = secondPine;
    }

    public int getResult() {

        if (firstPine == 10) {
            return 30;
        }

        if ((firstPine + secondPine) == 10) {
            return firstPine + 10;
        }

        return firstPine + secondPine;
    }
}
