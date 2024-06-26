package example.practice;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [][] array = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};

        //7 4 1
        //8 5 2
        //9 6 3

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        int [][] newArr = rotated(array);

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(newArr[i]));
        }



    }

    public static int[][] rotated (int [][] array) {
        int [][] arrayNew = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
               arrayNew[j][i] = array[i][j];
            }

        }

        int [][] nextNewArray = new int [array[0].length][array.length];
        for (int i = 0; i < arrayNew.length; i++) {
            for (int j = 0; j < arrayNew.length/2; j++) {
                int tmp = nextNewArray[i][j];
                nextNewArray[i][j] = nextNewArray[j][nextNewArray.length - j -1];
                nextNewArray[i][nextNewArray.length - j -1] = tmp;

            }
        }



        return nextNewArray;
    }


}
