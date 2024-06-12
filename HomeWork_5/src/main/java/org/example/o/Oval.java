package org.example.o;

public class Oval extends СirclesShapes {
    private  double squareOval;

    public Oval(int radius, int longRadius) {
        this.radius = radius;
        this.longRadius = longRadius;
    }

    @Override
    public void calculateArea() {
        squareOval = radius * longRadius * PI;
    }

    @Override
    public String toString() {
        return "The area of the ellipse, with radius " + radius + " and long radius " + longRadius + " = " + squareOval;
    }
}
