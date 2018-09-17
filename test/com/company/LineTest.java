package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.company.Line.lineFrames;
import static com.company.Line.play;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LineTest {

    @Test
    void getFrames_expectSameLine() {
        Line line = play();
        assertEquals(line, line);
    }

    @Test
    void newFrames_expectSameLineAfterAddFrame() {
        Frame frame = new Frame(0, 0);
        List<Frame> frames = new ArrayList<>();
        frames.add(frame);

        Line line = play();
        assertEquals(lineFrames(frames), line.newFrames(frame));
    }
}
