package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.example.Constants.*;

public class Player {

    private String name;
    private int[][] grid = new int[10][10];
    private List<Ship> shipsLeft = new ArrayList();
    private static Scanner scan = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.grid = grid;
        this.shipsLeft = shipsLeft;
    }

    public String getName() {
        return name;
    }

    public int[][] getGrid() {
        return grid;
    }

    public List<Ship> getShipsLeft() {
        return shipsLeft;
    }

    public boolean allShipsNotSink() {
        return shipsLeft.isEmpty();
    }


    public void placeShips() {
        int shipH;
        int shipW;

        for (int i = 1; i <= 2; i++) {
            System.out.printf("Игрок %s, какой корабль вы хотите установить?\n" +
                            "1 -  однопалубный (%d штук) \n" +
                            "2 - двухпалубный (%d штук) \n" +
                            "3 - трехпалубный (%d штук) \n" +
                            "4 - четырехпалубный (%d штук) \n",
                    getName(), SINGLE_DECK, DOUBLE_DECK, THREE_DECK, FOUR_DECK);
            int typeShip = scan.nextInt();
            for (int j = 1; j <= typeShip; j++) {
                System.out.println("Добавите координаты");
                shipH = scan.nextInt();
                shipW = scan.nextInt();
                getGrid()[shipH][shipW] = 1;
                shipsLeft.add(new Ship(shipH, shipW));
            }
        }
    }

    public void receiveShot(Player player) {
        System.out.printf("Игрок %s, Введите координаты выстрела\n", this.name);
        int shipH = scan.nextInt();
        int shipW = scan.nextInt();
        if (player.getGrid()[shipH][shipW] == 1) {
            System.out.println("Убит");
            player.getGrid()[shipH][shipW] = 0;
            for (int i = 0; i < player.shipsLeft.size(); i++) {
                if (player.shipsLeft.get(i).getHigh() == shipH && player.shipsLeft.get(i).getWidth() == shipW) {
                    player.shipsLeft.remove(i);
                }
            }
        } else {
            System.out.println("Мимо");

        }
        if (player.allShipsNotSink()) {
            System.out.println("Все корабли противника потоплены");
            System.out.printf("%s, вы победитель!", this.name);

        }
    }
}


