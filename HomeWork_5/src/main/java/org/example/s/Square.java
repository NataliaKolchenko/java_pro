package org.example.s;

public class Square extends  GeometricShapeWithSides {
    private  double squareSquare;

    public Square(int sideA, int diagonal) {
        this.sideA = sideA;
        this.diagonal = diagonal;
    }


    @Override
    public void calculateArea() {
        if (sideA != 0) {
            squareSquare = sideA * sideA;
        } else if (diagonal != 0) {
            squareSquare = (double) (diagonal * diagonal) / 2;
        }

    }

    @Override
    public String toString() {return "The area of the Square " + " = " + squareSquare;
    }
}
