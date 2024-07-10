package example.Collectors.flatMap;

import java.util.*;
import java.util.stream.Collectors;

// Преобразовать список стран, каждая из которых имеет список городов, в один список всех городов.
//вывести список стран и их городов
public class Ex10 {
    public static void main(String[] args) {

        List<Country> countryList = new ArrayList<>();
        countryList.add(new Country("Germany", List.of("Berlin", "Hamburg", "Leipzig")));
        countryList.add(new Country("Russia", List.of("Moscow", "SPb", "Ekaterinburg", "Krasnodar")));
        countryList.add(new Country("Spain", List.of("Barcelona", "Madrid")));

        System.out.println("1st -------------------");
//вывести список стран и их городов
        for (Country list : countryList) {
            System.out.println(list.getCountryName());
            for (String item : list.getCitiesInCountry()) {
                System.out.print(item + " ");
            }
            System.out.println();
        }

        System.out.println("2nd -------------------");

//один список всех городов.
        countryList.stream()
                .map(Country::getCitiesInCountry)
                .flatMap(List::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("3rd -------------------");

//вывести список стран и их городов
   List<String> res = countryList.stream()
           .map(country -> country.getCitiesInCountry()
                   .stream()
                   .map(city->country.getCountryName()+ " "+city)
                   .toList()
           )
           .flatMap(Collection::stream)
           .toList();
        System.out.println(res);




    }

}


class Country {
    private String countryName;
    private List<String> citiesInCountry;

    public Country(String countryName, List<String> citiesInCountry) {
        this.countryName = countryName;
        this.citiesInCountry = citiesInCountry;
    }

    public String getCountryName() {
        return countryName;
    }

    public List<String> getCitiesInCountry() {
        return citiesInCountry;
    }
}
