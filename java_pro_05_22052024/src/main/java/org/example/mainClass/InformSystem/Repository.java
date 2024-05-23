package org.example.mainClass.InformSystem;

import java.util.Arrays;
import java.util.SplittableRandom;

public class Repository {

    private static int idGlobal;
    private static Person[] storage;
    private static int count = 9;


    public Repository(int count) {
        this.count = count;
        this.storage = new Person[this.count+1];
        this.idGlobal = 0;
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

    public static void printPerson (Person person) {

    }

    public static void updatePersonById (int id, String newName, int newAge) {
        if (id < 0 || id > idGlobal-1) {

        }

        storage[id].setPersonName(newName);
        storage[id].setPersonAge(newAge);
    }

    public static void deletePersonById (int id) {
        if (id < 0 || id > idGlobal) {
        System.out.println("id and person don't exist");
    }
        storage[id].setPersonName(null);
        storage[id].setPersonAge(0);
    }


}


