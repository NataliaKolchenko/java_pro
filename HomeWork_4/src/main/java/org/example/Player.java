package org.example;

//Создать класс Player с полями:
//name - имя игрока;
//grid - игровое поле, представленное двумерным массивом символов;
//shipsLeft - массив, содержащий количество оставшихся кораблей каждого типа.

//Реализовать следующие методы в классе Player:
//Конструктор, принимающий имя игрока и инициализирующий игровое поле;
//getName - метод для получения имени игрока;
//allShipsSunk - метод, проверяющий, потоплены ли все корабли игрока;
//placeShips - метод для расстановки кораблей на игровом поле;
//receiveShot - метод для обработки выстрела противника.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private String name;
    private  int[][] grid = new int[10][10];
//    private static int[][] gridB = new int[10][10];
    private List <Ship> shipsLeft = new ArrayList(2);
//    private List <Ship>shipsLeftB = new ArrayList(3);
    private Scanner scan = new Scanner(System.in);

    private int singleDeck = 4;
    private int doubleDeck = 3;
    private int threeDeck = 2;
    private int fourDeck = 1;

    public Player(String name) {
        this.name = name;
        this.grid = grid;
        this.shipsLeft = shipsLeft;
//        this.shipsLeft = shipsLeft;
    }

    public String getName() {
        return name;
    }

    public  int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public void setShipsLeft(List<Ship> shipsLeft) {
        this.shipsLeft = shipsLeft;
    }

    public List<Ship> getShipsLeft() {
        return shipsLeft;
    }

    public boolean allShipsNotSink() {
        return shipsLeft.isEmpty();
    }


    public void placeShips(Player player) {
        int shipH;
        int shipW;

            for (int i = 1; i <= 2; i++) {
                System.out.printf("Игрок %s, какой корабль вы хотите установить?\n" +
                                "1 -  однопалубный (%d штук) \n" +
                                "2 - двухпалубный (%d штук) \n" +
                                "3 - трехпалубный (%d штук) \n" +
                                "4 - четырехпалубный (%d штук) \n",
                        this.name, singleDeck, doubleDeck, threeDeck, fourDeck);
                int typeShip = scan.nextInt();
                for (int j = 1; j <= typeShip; j++) {
                    System.out.println("Добавите координаты");
                    shipH = scan.nextInt();
                    shipW = scan.nextInt();
                    player.getGrid()[shipH][shipW] = 1;
                    player.shipsLeft.add(new Ship (shipH, shipW));
                }
            }
        }


    public void receiveShot(Player player) {

        System.out.printf("Игрок %s, Введите координаты выстрела\n", name);
        int shipH = scan.nextInt();
        int shipW = scan.nextInt();
        if (player.getGrid()[shipH][shipW] == 1) {
            System.out.println("Убит");
                for(int i = 0; i < player.shipsLeft.size(); i++) {
                    if(player.shipsLeft.get(i).getHigh() == shipH && player.shipsLeft.get(i).getWidth() == shipW){
                       player.shipsLeft.remove(i);

                    }

                }

        } else {
            System.out.println("Мимо");
        }
        if (allShipsNotSink()){
            System.out.println("Все корабли противника потоалены");
            System.out.printf("%s, вы победитель!", player.getName());

        }
    }


}
