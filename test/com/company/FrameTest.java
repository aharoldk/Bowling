package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrameTest {

    @Test
    void getResult_expect0WhenNothingPinFall() {
        Frame frame = new Frame(0, 0);

        assertEquals(0, frame.getResult());
    }

    @Test
    void getResult_expect30WhenStrike() {
        Frame frame = new Frame(10, 0);

        assertEquals(30, frame.getResult());
    }

    @Test
    void getResult_expect19WhenSpare_firstPine_9_andSecondPine_1() {
        Frame frame = new Frame(9, 1);

        assertEquals(19, frame.getResult());
    }

    @Test
    void getResult_expect15WhenSpare_firstPine_5_andSecondPine_5() {
        Frame frame = new Frame(5, 5);

        assertEquals(15, frame.getResult());
    }

    @Test
    void getResult_expect7When_firstPine_5_andSecondPine_2() {
        Frame frame = new Frame(5, 2);

        assertEquals(7, frame.getResult());
    }

    @Test
    void getResult_expect7When_firstPine_5_andSecondPine_3() {
        Frame frame = new Frame(5, 3);

        assertEquals(8, frame.getResult());
    }

    @Test
    void toString_expectGet_10_0_WhenStrike() {
        Frame frame = new Frame(10, 0);

        assertEquals("10 0", frame.toString());
    }

    @Test
    void toString_expectGet_7_3_WhenSpare() {
        Frame frame = new Frame(7, 3);

        assertEquals("7 3", frame.toString());
    }
}
