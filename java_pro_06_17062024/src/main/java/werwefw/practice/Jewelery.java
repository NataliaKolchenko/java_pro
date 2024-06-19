package werwefw.practice;

import java.util.Arrays;

public class Jewelery {
    public static void main(String[] args) {
        String jS = "aIb";
        String set = "jHaaivyIilkfbgtB";


        int[] count = new int[jS.length()];




        //решение через 1 цикл, но второй под капотом
//        for (int i = 0; i < set.length(); i++) {
//          if (jS.contains(String.valueOf(set.charAt(i)))) {
//              count[jS.indexOf(set.charAt(i))]++;
//          }
//
//
//        }

        //решение с 2 циклами
//        for (int i = 0; i < jS.length(); i++) {
//            for (int j = 0; j < set.length(); j++) {
//                if (jS.charAt(i) == set.charAt(j)) {
//                    count[i]++;
//                }
//            }
//        }


//        System.out.println(Arrays.toString(count));


        //решение c  1 циклом, но выводом единого count
        System.out.println(getNumOf(jS, set));
    }

    public static int getNumOf (String j, String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (j.indexOf(s.charAt(i)) > -1) {
                count++;
            }
        }
        return count;
    }
}
