package example.Collectors.flatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Преобразовать список домов, каждый из которых имеет список комнат, в один список всех комнат.
public class Ex18 {
    public static void main(String[] args) {
        List<Houses> housesList = new ArrayList<>();

        housesList.add(new Houses
                ("Adam's house",
                        List.of(
                                new Room("Parent's room"),
                                new Room("Children"),
                                new Room("Kitchen"))));

        housesList.add(new Houses
                ("Sandy's house",
                        List.of(
                                new Room("Cabinet"),
                                new Room("Living room"),
                                new Room("Toilet"))));

        housesList.add(new Houses
                ("Sam's house",
                        List.of(
                                new Room("Playing room"),
                                new Room("Music room"),
                                new Room("Kitchen"))));

        housesList.stream()
                .map(Houses::getRoomsList)
                .flatMap(List::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);



    }
}

class Houses {
    private String houseName;
    private List<Room> roomList;

    public Houses(String houseName, List<Room> roomList) {
        this.houseName = houseName;
        this.roomList = roomList;
    }



    public String getHouseName() {
        return houseName;
    }

    public List<Room> getRoomsList() {
        return roomList;
    }
}

class Room {
    private String roomName;

    public Room(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomName='" + roomName + '\'' +
                '}';
    }
}
