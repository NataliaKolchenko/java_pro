package Lections;

import java.util.Arrays;

public class LambdaClassEx {
    public static void main(String[] args) {
        String[] strArr = {"qwer", "", "qw", "e"};

//        int[] res = where(strArr, item -> item.length(), Main::nameMethod);
        int[] res = where(strArr, item -> item.length(), (strArr1, cl) -> nameMethod(strArr1, cl));
        System.out.println(Arrays.toString(res));
    }

    static int[] where(String[] data, CheckLength op, ArrayStringProcessor asp) {
        return  asp.processArray(data, op);
    }

    static int[] nameMethod (String[] strArrItems, CheckLength cl) {
        int[] numbArr = new int[strArrItems.length];
        for (int i = 0; i < strArrItems.length; i++) {
            numbArr[i] = cl.lengthOur(strArrItems[i]);

        }
        return numbArr;
    }


    @FunctionalInterface
    interface CheckLength {
        int lengthOur(String item);
    }


    @FunctionalInterface
    interface ArrayStringProcessor {
        int[] processArray (String[] strArr, CheckLength cl);
    }
}