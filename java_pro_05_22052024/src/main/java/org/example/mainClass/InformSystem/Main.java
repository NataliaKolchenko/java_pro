package org.example.mainClass.InformSystem;

public class Main {


    public static void main(String[] args) {

        Repository rep = new Repository(10);

        for (int i = 0; i <= Repository.getCount(); i++) {
            Repository.addPerson("Masha", ((int)(Math.random() * (80 - 10 + 1) + 10)));
            Repository.printPersonById(i);
        }

        System.out.println();


        Repository.updatePersonById(5, "Natalia", 333);
        Repository.updatePerson(Repository.getPersonById(0), "Sveltana", 7777);

        for (int i = 0; i <= Repository.getCount(); i++) {
            Repository.printPersonById(i);
        }

        System.out.println();

        Repository.deletePersonById(7);
        Repository.deletePerson(Repository.getPersonById(5));

        for (int i = 0; i <= Repository.getCount(); i++) {
            Repository.printPersonById(i);
        }




    }
}
