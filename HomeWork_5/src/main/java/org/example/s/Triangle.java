package org.example.s;
//Необходимо реализовать метод, который проверяет, является ли треугольник прямоугольным.

public class Triangle extends GeometricShapeWithSides {
    private  double squareTriangle;

    public Triangle(int sideA, int sideB, int sideC, int corner1, int corner2) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.corner1 = corner1;
        this.corner2 = corner2;
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

    public boolean isRightAngledTriangle() {
        int res = corner1 + corner2;
        if (res == 90) {
            return true;
        }
        return false;
    }

    public void printResultOfRightAngledTriangle(boolean res) {
        if (res == true) {
            System.out.println("YES, triangle is Right-Angled");
        } else {
            System.out.println("NO");
        }
    }
}
