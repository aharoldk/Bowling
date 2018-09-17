package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FramesTest {

    @Test
    void getResult_expect0WhenNothingPinFall() {
        Frames frames = new Frames(0, 0);

        assertEquals(0, frames.getResult());
    }

    @Test
    void getResult_expect30WhenStrike() {
        Frames frames = new Frames(10, 0);

        assertEquals(30, frames.getResult());
    }

    @Test
    void getResult_expect19WhenSpare_firstPine_9_andSecondPine_1() {
        Frames frames = new Frames(9, 1);

        assertEquals(19, frames.getResult());
    }

    @Test
    void getResult_expect15WhenSpare_firstPine_5_andSecondPine_5() {
        Frames frames = new Frames(5, 5);

        assertEquals(15, frames.getResult());
    }
}
