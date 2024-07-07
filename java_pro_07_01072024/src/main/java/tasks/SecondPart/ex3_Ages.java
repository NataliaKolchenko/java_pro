package tasks.SecondPart;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Преобразовать список кортежей (имя, возраст) в список строк с описанием (имя is в возраст год(а/лет)).
public class ex3_Ages {
    public static void main(String[] args) {
        List<NameAndAge> list = new ArrayList<>();
        for (int i = 100; i <= 125; i++) {
            list.add(new NameAndAge("fas", i));}
        List<String> stringList1 = list.stream()
                .map(e -> {
                    String res = e.getName() + " " + e.getAge() + " " + ex3_Ages.getYearDeclension(e.getAge());                    return res;
                }        )
                .collect(Collectors.toList());

        System.out.println(stringList1);
    }
    static String getYearDeclension(int age) {    String res = "";
        if (age % 10 == 1 && age % 100 != 11) {        res += "god";
        } else if (age % 10 >= 2 && age % 10 <= 4 && (age % 100 < 12 || age % 100 > 14)) {        res += "goda";
        } else {        res += "let";
        }    return res;

    }

    public static class  NameAndAge {
        private String name;
        private int age;

        public NameAndAge(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
