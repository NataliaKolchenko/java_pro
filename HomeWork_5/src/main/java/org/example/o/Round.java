package org.example.o;

public class Round extends СirclesShapes {
     private  double squareRound;

    public double getSquareRound() {
        return squareRound;
    }

    public Round(int radius, int diagonal, int length) {
        this.radius = radius;
        this.diagonal = diagonal;
        this.length = length;
    }

    @Override
    public void calculateArea() {

        if (getRadius() != 0) {
            squareRound =  PI * (radius * radius);
        } else if (getDiagonal() != 0) {
            squareRound =  (diagonal * 2) / 4 * PI;
        } else if (getLength() != 0) {
            squareRound =  (length * 2) / (4 * PI);
        }



    }

    @Override
    public String toString() {
        String startStr = "The area of the circle ";
        if (radius != 0) {
            return startStr + "with radius " + radius + " = " + squareRound;
        } else if (diagonal != 0 ) {
            return startStr + "with diagonal " + diagonal + " = " + squareRound;
        } else if (length != 0) {
            return startStr + "with length " + length + " = " + squareRound;
        } else if(longRadius != 0) {
            return startStr + "with radius " + radius + " and long radius = " + longRadius + " = " + squareRound;
        }
        return "Incorrect calculations";
    }
}
