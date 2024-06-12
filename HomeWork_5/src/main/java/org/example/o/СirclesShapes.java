package org.example.o;

import org.example.OperationsWithShapes;

public abstract class СirclesShapes implements OperationsWithShapes {
    protected int radius;
    protected int diagonal;
    protected int length;
    protected int longRadius;

    public static final double PI = 3.14;

    public int getRadius() {
        return radius;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getLength() {
        return length;
    }

    public int getLongRadius() {
        return longRadius;
    }
}
