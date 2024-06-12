package org.example.s;

public class Triangle extends  GeometricShapeWithSides {
    private  double squareTriangle;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    @Override
    public void calculateArea() {
            int pBig = sideA + sideB + sideC;
            int pHalf = pBig / 2;
            squareTriangle = Math.sqrt (pHalf * (pHalf - sideA) * (pHalf - sideC) * (pHalf - sideC));

    }

    @Override
    public String toString() {
        return "The area of the Triangle " + " = " + squareTriangle;
    }
}
