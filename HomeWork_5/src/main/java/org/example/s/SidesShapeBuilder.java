package org.example.s;

public class SidesShapeBuilder {
    private int sideA;
    private int sideB;
    private int sideC;
    private int diagonal;

    public SidesShapeBuilder setSideA(int sideA) {
        this.sideA = sideA;
        return this;
    }

    public SidesShapeBuilder setSideB(int sideB) {
        this.sideB = sideB;
        return this;
    }

    public SidesShapeBuilder setSideC(int sideC) {
        this.sideC = sideC;
        return this;
    }

    public SidesShapeBuilder setDiagonal (int diagonal) {
        this.diagonal = diagonal;
        return this;
    }



    public GeometricShapeWithSides buildSquare () {
        return new Square(sideA, diagonal);
    }

    public GeometricShapeWithSides buildTriangle () {
        return new Triangle(sideA, sideB, sideC);
    }


}
