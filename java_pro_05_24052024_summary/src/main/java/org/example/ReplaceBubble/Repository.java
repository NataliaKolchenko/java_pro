package org.example.ReplaceBubble;

public class Repository {

    public int[] replaceArrayBubbleSort (int [] array) {

        int temp = 0;

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == 0) {
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;

            }
        }
        return array;
    }
}
