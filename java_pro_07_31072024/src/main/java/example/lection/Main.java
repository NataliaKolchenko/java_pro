package example.lection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Storage storage = new Storage<>();

        List<Number> list = new ArrayList<>();
        list.add(2);
        list.add(5.3);

        storage.addItems(1);
        storage.addItems(19.4);

        storage.addAll(list);
        System.out.println("Storage: " + storage);

        storage.sendToList(list);
        System.out.println("List: " + list);

//        System.out.println("Sum " + storage.getSumNumbers());

//        storage.removeItems(1);


//        try {
//            System.out.println("Number in storage " + storage.getItem(0));
//        } catch (EmptyStorageException | IndexOutOfBoundsException | IllegalArgumentException e) {
//            System.out.println("Error: " + e.getMessage());
//        }




    }
}