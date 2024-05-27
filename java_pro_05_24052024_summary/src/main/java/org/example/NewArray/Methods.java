package org.example.NewArray;

import java.util.Arrays;
import java.util.Random;

public class Methods {

    public  int[] createArray (int sizeArray) {
        int [] array = new int [sizeArray];

        Random random = new Random();


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        return array;
    }

    public boolean isArrayNull (int userAnswer) {
        if (String.valueOf(userAnswer).isBlank() || userAnswer==0) {
            return true;

        }
        return false;
    }

    public  int[] sortArray(int [] array) {
        int [] newArray = new int [array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newArray[count] = array[i];
                count++;
            }

        }
        return newArray;
    }

    public boolean isArrayHasZero (int [] array) {
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public void printArray (int [] array) {
        System.out.println(Arrays.toString(array));
    }
}
