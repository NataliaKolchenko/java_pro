package practice;

//Есть отсортированный массив. Есть искомое число N.
//Вернуть пару чисел, которые в сумме дали число N
public class ArrayAndNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 13, 66, 85};
        int number = 87;
        //x + y = 70
        //y = 70 - x
        int x;
        int y;

        for (int i = 0, j = (arr.length - 1); i < arr.length; ) {
            if (arr[j] > number) {
                j--;
            } else {
                x = arr[j];
                y = number - x;
                if (arr[i] == y) {
                    System.out.println(x + " + " + y + " = " + number);
                    return;
                } else {
                    i++;
                }
            }

        }
    }
}
