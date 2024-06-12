package org.example.s;

import org.example.OperationsWithShapes;

public abstract class GeometricShapeWithSides implements OperationsWithShapes {
    protected int sideA;
    protected int sideB;
    protected int sideC;
    protected int diagonal;

    public static final double PI = 3.14;

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public int getDiagonal() {
        return diagonal;
    }
}
