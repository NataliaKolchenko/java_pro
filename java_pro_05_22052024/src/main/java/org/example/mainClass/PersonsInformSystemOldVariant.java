package org.example.mainClass;

import java.util.Arrays;

public class PersonsInformSystemOldVariant {
    private static int count = 10;

    private static String[] namesArray = new String[count];
    private static int[] ageArray = new int[count];
    private static int idGlobal = 0;

//        * В методе main создается 10 человек с именами "Имя i" и случайными возрастами от 10 до 80 лет.
//        После создания каждого человека выводится его информация.
    public static void main(String[] args) {
        int min = 10;
        int max = 80;

        for (int i = 0; i <= count-1; i++) {
            createPerson("Name" + i, ((int)(Math.random() * (max - min + 1) + min)));
            //System.out.println(Arrays.toString( getPersonByIdString (i)));

            printPersonByIdVoid(i);

        }
        System.out.println();

        updatePersonById(5, "Anna", 000);

        deletePersonById(9);

        for (int i = 0; i <= count-1; i++) {
            printPersonByIdVoid(i);
        }

    }

//    Создание людей:
//    Создать метод createPerson, принимающий параметры String personName и int personAge. Метод должен добавлять имя и возраст в соответствующие массивы.
//    Проверить, что текущий индекс не превышает размер массива. Если превышает, метод должен завершаться без добавления нового человека.
    public static void createPerson(String personName, int personAge) {
        namesArray[idGlobal] = personName;
        ageArray[idGlobal] = personAge;
        if (idGlobal > namesArray.length) {
            return;
        }
        idGlobal++;
    }

//    Получение информации о человеке по ID:
//    Создать метод getPersonById, который принимает int id и возвращает массив из двух элементов: имя и возраст (String[]).
//    Если ID не существует (меньше нуля или больше текущего индекса),
//    возвращать массив с значениями по умолчанию: {"empty", "-1"}.

    public static String[] getPersonByIdString (int id) {
        if (id < 0 || id > idGlobal) {
            return new String[]{"empty", "-1"};
        }
        return new String[]{namesArray[id], String.valueOf(ageArray[id])};
    }

//    4. Вывод информации о человеке по ID:
//    Создать метод printPersonById, который принимает int id и выводит в консоль имя и возраст человека с данным ID.
//    Если ID не существует, метод ничего не выводит.

    public static void printPersonByIdVoid (int id) {
        if (id < 0 || id > idGlobal-1) {
            System.out.println();
        }
        String [] newArr = {namesArray[id], String.valueOf(ageArray[id])};
        System.out.println(Arrays.toString(newArr));

    }

//    5. Вывод информации о человеке из массива:
//    Создать метод printPerson, который принимает массив из двух элементов (String[] person) и выводит информацию о человеке в
//    консоль.

    public static void printPerson (String[] person) {
        System.out.println(person);
    }

//    6. Изменение информации о человеке по ID:
//    Создать метод updatePersonById, который принимает int id,String newName,int newAge и изменяет имя и возраст человека с данным ID.
//    Если ID не существует, метод должен завершаться без изменений.

    public static void updatePersonById (int id, String newName, int newAge) {
        if (id < 0 || id > idGlobal) {

        }
        namesArray[id] = newName;
        ageArray[id] = newAge;
    }

//    8. Удаление информации о человеке по ID:
//    По указанному id человека удалить информацию
//    о нём

    public static void deletePersonById (int id) {
        if (id < 0 || id > idGlobal) {
            System.out.println("id and person don't exist");
        }
        namesArray[id] = null;
        ageArray[id] = 0;
    }




}