package org.example.s;

public class SidesShapeBuilder {
    private int sideA;
    private int sideB;
    private int sideC;
    private int diagonal;
    private int corner1;
    private int corner2;

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
    public SidesShapeBuilder setCorner1 (int corner1) {
        this.corner1 = corner1;
        return this;
    }

    public SidesShapeBuilder setCorner2 (int corner2) {
        this.corner2 = corner2;
        return this;
    }



    public Square buildSquare () {
        return new Square(sideA, diagonal);
    }

    public Triangle buildTriangle () {
        return new Triangle(sideA, sideB, sideC, corner1, corner2);
    }


}
