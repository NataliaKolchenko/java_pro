package example.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonWords_2nd_solution {
    public static void main(String[] args) {
//        String[] stringArr = {"ruck", "lu", "cooulii", "cualk", "caull", "culoou"};
        String[] stringArr = {"a", "aab", "aabc", "aabcd"};
        System.out.println(Arrays.toString(stringArr));
        System.out.println(commonChars(stringArr));
    }


    public static List<String> commonChars(String[] arr) {
        List<String> commonChars = new ArrayList<>();
        Integer[] freq = new Integer[26];
//        System.out.println(Arrays.toString(freq));

        Arrays.fill(freq, Integer.MAX_VALUE);
//        System.out.println(Arrays.toString(freq));

        for (String currentEl : arr) {
            int[] freqIn = new int[26];
//            System.out.println(currentEl);

            for (char c : currentEl.toCharArray()) {
                freqIn[c - 'a']++;
//                System.out.println(c);
            }

            for (int i = 0; i < 26; i++) {
                freq[i] = Math.min(freq[i], freqIn[i]);
//                System.out.println(Arrays.toString(freq));
//                System.out.println(Arrays.toString(freqIn));
            }
        }

        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                commonChars.add(String.valueOf((char) (i + 'a')));
                freq[i]--;
//                System.out.println(commonChars);
            }
        }

//        System.out.println(Arrays.toString(freq));

        return commonChars;
    }
}
