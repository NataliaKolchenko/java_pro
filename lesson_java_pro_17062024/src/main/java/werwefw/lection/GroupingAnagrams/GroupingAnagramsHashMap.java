package werwefw.lection.GroupingAnagrams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class GroupingAnagramsHashMap {
    public static void main(String[] args) {

      String[] str =  {"eat", "tea", "tan", "ate", "nat", "bat"};
      HashMap<String, ArrayList<String>> mapa = new HashMap<>();

      for (int i = 0; i < str.length; i++) {

          char [] ch = str[i].toCharArray();
          Arrays.sort(ch);
          String sorted = new String(ch);

          if (!mapa.containsKey(sorted)) {
              mapa.put(sorted, new ArrayList<String>());
              mapa.get(sorted).add(str[i]);
          } else {
              mapa.get(sorted).add(str[i]);
          }

      }
        System.out.println(mapa);

      ArrayList<ArrayList<String>> listList = new ArrayList<>();
      for (ArrayList<String> strArr : mapa.values()){
//          System.out.println(strArr);
          listList.add(strArr);
      }

        System.out.println(listList);
    }
}