package com.geometry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void twoSamePointsShouldReturnZero() {
        Point point1 = new Point();
        Point point2 = new Point();
        assertEquals(0, point1.distanceTo(point2), 0.0001);
    }
}
