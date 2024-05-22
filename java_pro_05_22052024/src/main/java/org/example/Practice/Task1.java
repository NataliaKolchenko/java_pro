package org.example.Practice;

public class Task1 {

    public static void main(String[] args) {

//        Task1  task1 = new Task1();
        int newArr []= {1,2,3,4,5,6,7};
        System.out.println(new Task1().getSum(newArr));


    }

    public  int add (int [] arr1) {
        int temp = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                temp += arr1[i];
            }
        }
        return temp;
    }

    public  int getSum (int [] arr) {
        int result = 0;
        for (int i = 0; i < arr.length / 2; i++) {

            result = result + arr[i] + arr[arr.length - 1 - i];
        }
           if (arr.length % 2 !=0) {
               result += arr[arr.length/2];
           }

        return result;
    }
//тоже самое, что и предыдущий метод, но с иным подходом
    public static int sumCascadeNumbers( int[] arr){
        int resultSum = arr.length%2 == 0? 0: arr[arr.length/2];
        for (int i = 0; i < arr.length / 2; i++) {
            resultSum+= arr[i] + arr[arr.length - 1 - i];
        }
        return resultSum;
    }
}
