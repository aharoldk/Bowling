package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Line {

    private final List<Frame> frames;

    private Line(List<Frame> frames) {
        this.frames = frames;
    }

    static Line play() {
        return new Line(new ArrayList<>());
    }

    static Line lineFrames(List<Frame> frames) {
        return new Line(frames);
    }

    Line newFrames(Frame frame) {
        frames.add(frame);

        return lineFrames(frames);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Line that = (Line) obj;

        return Objects.equals(frames, that.frames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frames);
    }
}
