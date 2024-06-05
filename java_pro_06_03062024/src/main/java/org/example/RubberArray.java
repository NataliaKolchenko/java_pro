package org.example;

public class RubberArray {
    private int size;
    private int[] array;

    public RubberArray() {
        this.size = 0;
        this.array = new int[this.size];
    }

    public void append(int item) {
        size++;
        int[] newArray = new int[size];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[size - 1] = item;

        array = newArray;
    }

    public void appendRange(int... items) {
        for (int i = 0; i < items.length; i++) {
            append(items[i]);
        }
    }

    public void remove(int item) {
        int pos = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            return;
        }
        removeAt(pos);
    }

    public void removeAt(int position) {
        if(position<0 || position >= size){
            return;
        }
        size--;
        int[] temp = new int[size];

        for (int i = 0; i < position; i++) {
            temp[i] = array[i];
        }
        for (int i = position; i < size; i++) {
            temp[i] = array[i + 1];
        }
        array = temp;
    }




    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < array.length; i++) {
            res += String.valueOf(array[i]) + " ";
        }
        return "[" + res.trim() + "]";
    }
}