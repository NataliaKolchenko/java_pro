package org.example.mainClass.InformSystem;

import java.util.Arrays;
import java.util.SortedMap;
import java.util.SplittableRandom;

public class Repository {

    private static int idGlobal;
    private static Person[] storage;
    private static int count = 10;


    public Repository(int count) {
        Repository.count = count;
        storage = new Person[Repository.count +1];
        idGlobal = 0;
    }

    public static int getCount() {
        return count;
    }

    public static void addPerson (String personName, int age) {
        storage[idGlobal] = new Person(personName, age);
        if (idGlobal > storage.length) {
            return;
        }
        idGlobal++;
    }

    public static void printPersonById (int id) {
        if (id < 0 || id > idGlobal-1) {
            System.out.println();
        }
        System.out.println("id-"+id + " " +storage[id].getPersonName() + " " + storage[id].getPersonAge());
    }


    //    обновление по ID
    public static void updatePersonById (int id, String newName, int newAge) {
        if (id < 0 || id > idGlobal-1) {
        }
        storage[id].setPersonName(newName);
        storage[id].setPersonAge(newAge);
    }


//    обновление по объекту
    public static void updatePerson (Person person, String newName, int newAge) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].getPersonName().equals(person.getPersonName()) && storage[i].getPersonAge() == person.getPersonAge()) {
                storage[i].setPersonName(newName);
                storage[i].setPersonAge(newAge);
            }
        }

    }

    public static Person getPersonById (int id) {
        return storage[id];
    }

    //    удаление по ID
    public static void deletePersonById (int id) {
        if (id < 0 || id > idGlobal) {
        System.out.println("id and person don't exist");
    }
        storage[id].setPersonName("");
        storage[id].setPersonAge(0);
    }

    //    удаление по объекту

    public static void deletePerson (Person person) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].getPersonName().equals(person.getPersonName()) && storage[i].getPersonAge() == person.getPersonAge()) {
                storage[i].setPersonName("");
                storage[i].setPersonAge(0);
            }
        }
    }




}


