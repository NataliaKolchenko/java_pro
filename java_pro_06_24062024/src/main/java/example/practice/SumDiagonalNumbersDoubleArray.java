package example.practice;

public class SumDiagonalNumbersDoubleArray {
    public static void main(String[] args) {

        int[][] array = {{0,1,2},{0,1,2},{0,1,2}};
        System.out.println(getDiff(array));
    }

//    public static int getDiff (int[][] array) {
//        int sumLeftDiagonal = 0;
//        int sumRightDiagonal = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++){
//                if (i == j) {
//                    sumLeftDiagonal += array[i][j];
//
//                }
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = array.length-1; j >= 0; j--) {
//                if (i+j == array.length-1) {
//                    sumRightDiagonal += array[j][i];
//                }
//
//            }
//        }
//        return Math.abs(sumRightDiagonal - sumLeftDiagonal);
//    }

    public static int getDiff (int[][] array) {
        int sumLeftDiagonal = 0;
        int sumRightDiagonal = 0;
        for (int i = 0; i < array.length; i++) {
            sumLeftDiagonal += array[i][i];
            sumRightDiagonal += array[array.length-1-i][i];

        }
        return Math.abs(sumRightDiagonal - sumLeftDiagonal);
    }
}