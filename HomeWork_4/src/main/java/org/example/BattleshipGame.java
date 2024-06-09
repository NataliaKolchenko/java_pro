package org.example;

import java.util.Scanner;

public class BattleshipGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру 'Морской бой'!");

        System.out.println("Назовите имя 1го игрока");
        String nameA = scanner.nextLine();
        Player playerA = new Player(nameA);

        System.out.println("Назовите имя 2го игрока");
        String nameB = scanner.nextLine();
        Player playerB = new Player(nameB);

        playerA.placeShips();
        playerB.placeShips();


        while (!playerA.allShipsNotSink() && !playerB.allShipsNotSink()) {
                playerA.receiveShot(playerB);
                playerB.receiveShot(playerA);
            }

        }

    }
