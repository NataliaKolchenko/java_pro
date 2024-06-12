package org.example;

import org.example.o.СircledShapeBuilder;
import org.example.o.СirclesShapes;
import org.example.s.GeometricShapeWithSides;
import org.example.s.SidesShapeBuilder;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
//        СircledShapeBuilder csd = new СircledShapeBuilder();
        Scanner scan = new Scanner(System.in);
//        int userRadiusCircle;
//        СirclesShapes temp;
//
//        System.out.println("What is size of radius of circle?");
//        userRadiusCircle = scan.nextInt();
//        temp = csd.setRadius(userRadiusCircle).buildRound();
//        temp.calculateArea();
//        System.out.println(temp);
//
//        System.out.println("What is size of diagonal of circle?");
//        userRadiusCircle = scan.nextInt();
//        temp = csd.setDiagonal(userRadiusCircle).buildRound();
//        temp.calculateArea();
//        System.out.println(temp);
//
//        System.out.println("What is size of length of circle?");
//        userRadiusCircle = scan.nextInt();
//        temp = csd.setLength(userRadiusCircle).buildRound();
//        temp.calculateArea();
//        System.out.println(temp);
//
//        System.out.println("What is size of radius of oval?");
//        int userRadiusOval = scan.nextInt();
//        System.out.println("What is size of long radius of oval?");
//        int userLongRadiusOval = scan.nextInt();
//        temp = csd.setRadius(userRadiusOval).setLongRadius(userLongRadiusOval).buildOval();
//        temp.calculateArea();
//        System.out.println(temp);

        System.out.println("-----------------------------");
        SidesShapeBuilder ssb = new SidesShapeBuilder();
        GeometricShapeWithSides temp;

        System.out.println("What is size of side of square?");
        int userSide = scan.nextInt();
        temp = ssb.setSideA(userSide).buildSquare();
        temp.calculateArea();
        System.out.println(temp);

        System.out.println("What is size of side and diagonal of square?");
        userSide = scan.nextInt();
        int userDiagonal = scan.nextInt();
        temp = ssb.setSideA(userSide).setDiagonal(userDiagonal).buildSquare();
        temp.calculateArea();
        System.out.println(temp);

        System.out.println("What is size of sides of triangle?");
        int userSideA = scan.nextInt();
        int userSideB = scan.nextInt();
        int userSideC = scan.nextInt();
        temp = ssb.setSideA(userSideA).setSideB(userSideB).setSideC(userSideC).buildTriangle();
        temp.calculateArea();
        System.out.println(temp);


    }
}
