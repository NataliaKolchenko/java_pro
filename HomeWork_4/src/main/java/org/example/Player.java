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

import java.util.Scanner;

public class Player {
    private String name;
    private static int[][] gridA = new int[10][10];
    private int[][] gridB = new int[10][10];
    //    private int[][] shipsLeft = new int[10][10];
    private Scanner scan = new Scanner(System.in);

    private int singleDeck = 4;
    private int doubleDeck = 3;
    private int threeDeck = 2;
    private int fourDeck = 1;

    public Player(String name) {
        this.name = name;
        this.gridA = gridA;
        this.gridB = gridB;
//        this.shipsLeft = shipsLeft;
    }

    public String getName() {
        return name;
    }

//    public boolean allShipsSunk () {
//
//    }

    public void placeShipsFromA() {
        int shipH;
        int shipV;

        for (int i = 1; i <= 4; i++) {
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
                shipV = scan.nextInt();
                gridA[shipH][shipV] = 1;
            }
        }
    }


    public void placeShipsFromAB() {
        int shipH;
        int shipV;

        for (int i = 1; i <= 4; i++) {
            System.out.printf("Игрок %s, какой корабль вы хотите установить?" +
                            "1 -  однопалубный (%d штук) \n" +
                            "2 - двухпалубный (%d штук) \n" +
                            "3 - трехпалубный (%d штук) \n" +
                            "4 - четырехпалубный (%d штук) \n",
                    this.name, singleDeck, doubleDeck, threeDeck, fourDeck);
            int typeShip = scan.nextInt();
            for (int j = 1; j <= typeShip; j++) {
                System.out.println("Добавите координаты");
                shipH = scan.nextInt();
                shipV = scan.nextInt();
                gridB[shipH][shipV] = 1;
            }
        }
    }

    public void receiveShotFromA() {
        int shipH = scan.nextInt();
        int shipV = scan.nextInt();
        if (gridB[shipH][shipV] == 1) {
            System.out.println("Убит");
        }
        System.out.println("Мимо");
    }

    public String receiveShotFromB() {
        int shipH = scan.nextInt();
        int shipV = scan.nextInt();
        if (gridA[shipH][shipV] == 1) {
            return "Убит";
        }
        return "Мимо!";
    }
}
