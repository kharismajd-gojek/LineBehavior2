package com.geometry;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distanceTo(Point other) {
        if (this.x == other.x) {
            return Math.abs(this.y - other.y);
        }
        return Math.abs(this.x - other.x);
    }
}
