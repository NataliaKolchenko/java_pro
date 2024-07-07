package example.Collectors.flatMap;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Преобразовать список пользователей, каждый из которых имеет список телефонов, в один список всех телефонов.
public class Ex7 {
    public static void main(String[] args) {

       List<Person> personList = new ArrayList<>();
       personList.add(new Person("Adam", List.of("8923874623", "293423948")));
       personList.add(new Person("Nate", List.of("3332323", "777767")));
       personList.add(new Person("Nick", List.of("88812312", "111231")));

       List <String> newList = personList.stream()
               .map(Person::getNumberList)
               .flatMap(List::stream)
               .collect(Collectors.toList());

        System.out.println(newList);

    }


}

 class Person {
    private String name;
    private List<String> numberList;

     public Person(String name, List<String> numberList) {
         this.name = name;
         this.numberList = numberList;
     }

     public String getName() {
         return name;
     }

     public List<String> getNumberList() {
         return numberList;
     }
 }
