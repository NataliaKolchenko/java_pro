package org.example.o;

public class СircledShapeBuilder {
    private int radius;
    private int diagonal;
    private int length;
    private int longRadius;

    public СircledShapeBuilder setRadius (int radius) {
        this.radius = radius;
        return this;
    }

    public СircledShapeBuilder setDiagonal (int diagonal) {
        this.diagonal = diagonal;
        return this;
    }

    public СircledShapeBuilder setLength(int length) {
        this.length = length;
        return this;
    }

    public СircledShapeBuilder setLongRadius (int longRadius) {
        this.longRadius = longRadius;
        return this;
    }

    public СirclesShapes buildRound() {

        return new Round(radius, diagonal, length);
    }

    public СirclesShapes buildOval () {
        return new Oval(radius, longRadius);
    }

}
