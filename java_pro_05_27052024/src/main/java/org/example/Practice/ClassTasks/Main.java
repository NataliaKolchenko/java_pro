package org.example.Practice.ClassTasks;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Vehicle[] vehiclesArray = new Vehicle[2];

        Auto auto1 = new Auto("newAuto", 200, "Gas");
        Bicycle bike1 = new Bicycle("bike1", 5, "avenue");

        vehiclesArray[0] = auto1;
        vehiclesArray[1] = bike1;

        System.out.println(Arrays.toString(vehiclesArray));
    }
}
