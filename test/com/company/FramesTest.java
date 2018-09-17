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

    @Test
    void getResult_expect7When_firstPine_5_andSecondPine_2() {
        Frames frames = new Frames(5, 2);

        assertEquals(7, frames.getResult());
    }

    @Test
    void getResult_expect7When_firstPine_5_andSecondPine_3() {
        Frames frames = new Frames(5, 3);

        assertEquals(8, frames.getResult());
    }

    @Test
    void toString_expectGet_10_0_WhenStrike() {
        Frames frames = new Frames(10, 0);

        assertEquals("10 0", frames.toString());
    }

    @Test
    void toString_expectGet_7_3_WhenSpare() {
        Frames frames = new Frames(7, 3);

        assertEquals("7 3", frames.toString());
    }
}
