package org.example.mainClass.InformSystem;

public class Main {


    public static void main(String[] args) {
        int min = 10;
        int max = 80;

        for (int i = 0; i <= Repository.getCount(); i++) {
            Repository.addPerson("Masha"+i, ((int)(Math.random() * (max - min + 1) + min)));
            Repository.printPersonById(i);
        }

        System.out.println();

        Repository.updatePersonById(5, "Natalia", 333);

        for (int i = 0; i <= Repository.getCount(); i++) {
            Repository.printPersonById(i);
        }

        System.out.println();

        Repository.deletePersonById(7);
        Repository.deletePersonById(1);
        Repository.deletePersonById(9);

        for (int i = 0; i <= Repository.getCount(); i++) {
            Repository.printPersonById(i);
        }




    }
}
