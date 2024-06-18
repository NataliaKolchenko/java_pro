package werwefw.lection.AcrossArrays;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arrayOne = {4, 9, 5, 7, 8};
        int[] arrayTwo = {9, 4, 9, 8, 4, 7};

        HashMap<Integer, ArrayList<Integer>> mapa = new HashMap<>();

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i] == arrayTwo[j]) {
                    mapa.put(arrayOne[i], new ArrayList<Integer>());
                    mapa.get(arrayOne[i]).add(arrayOne[i]);
                }
            }
        }
        System.out.println(mapa.values());
    }


}
