package com.geometry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void twoSamePointsShouldReturnZero() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 0);
        assertEquals(0, point1.distanceTo(point2), 0.0001);
    }

    @Test
    public void twoPointsWithOneSameAttributeShouldReturnResult() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 5);
        assertEquals(5, point1.distanceTo(point2), 0.0001);
    }
}
