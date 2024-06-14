package org.example;

import org.example.o.СircledShapeBuilder;
import org.example.o.СirclesShapes;
import org.example.s.GeometricShapeWithSides;
import org.example.s.SidesShapeBuilder;
import org.example.s.Triangle;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        СircledShapeBuilder csd = new СircledShapeBuilder();
        Scanner scan = new Scanner(System.in);
        int userRadiusCircle;
        СirclesShapes circleTemp;

        System.out.println("What is size of radius of circle?");
        userRadiusCircle = scan.nextInt();
        circleTemp = csd.setRadius(userRadiusCircle).buildRound();
        circleTemp.calculateArea();
        System.out.println(circleTemp);

        System.out.println("What is size of diagonal of circle?");
        userRadiusCircle = scan.nextInt();
        circleTemp = csd.setDiagonal(userRadiusCircle).buildRound();
        circleTemp.calculateArea();
        System.out.println(circleTemp);

        System.out.println("What is size of length of circle?");
        userRadiusCircle = scan.nextInt();
        circleTemp = csd.setLength(userRadiusCircle).buildRound();
        circleTemp.calculateArea();
        System.out.println(circleTemp);

        System.out.println("What is size of radius of oval?");
        int userRadiusOval = scan.nextInt();
        System.out.println("What is size of long radius of oval?");
        int userLongRadiusOval = scan.nextInt();
        circleTemp = csd.setRadius(userRadiusOval).setLongRadius(userLongRadiusOval).buildOval();
        circleTemp.calculateArea();
        System.out.println(circleTemp);

        System.out.println("-----------------------------");
        SidesShapeBuilder ssb = new SidesShapeBuilder();
        GeometricShapeWithSides shapeTemp;

        System.out.println("What is size of side of square?");
        int userSide = scan.nextInt();
        shapeTemp = ssb.setSideA(userSide).buildSquare();
        shapeTemp.calculateArea();
        System.out.println(shapeTemp);

        System.out.println("What is size of side and diagonal of square?");
        userSide = scan.nextInt();
        int userDiagonal = scan.nextInt();
        shapeTemp = ssb.setSideA(userSide).setDiagonal(userDiagonal).buildSquare();
        shapeTemp.calculateArea();
        System.out.println(shapeTemp);

        System.out.println("What is size of sides of triangle?");
        int userSideA = scan.nextInt();
        int userSideB = scan.nextInt();
        int userSideC = scan.nextInt();
        shapeTemp = ssb.setSideA(userSideA).setSideB(userSideB).setSideC(userSideC).buildTriangle();
        shapeTemp.calculateArea();
        System.out.println(shapeTemp);

        System.out.println("Add 1st and 2nd corner of triangle");
        Triangle triangleTemp;
        int userCorner1 = scan.nextInt();
        int userCorner2 = scan.nextInt();
        triangleTemp = ssb.setCorner1(userCorner1).setCorner2(userCorner2).buildTriangle();
        triangleTemp.printResultOfRightAngledTriangle(triangleTemp.isRightAngledTriangle());



    }
}
