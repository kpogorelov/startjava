package org.example;

public class MyFirstGame {
    public static void main(String[] args) {
        int hiddenNumber = 100;
        int playerNumber = 110;
        boolean playerWin = true;
        if (hiddenNumber > 0 && hiddenNumber <= 100) {
            while (hiddenNumber != playerNumber) {
                if (hiddenNumber > playerNumber) {
                    System.out.println("Число " + playerNumber + " меньше чем то что загадал компьютер");
                    playerNumber++;
                } else {
                    System.out.println("Число " + playerNumber + " больше чем то что загадал компьютер");
                    playerNumber--;
                }
            }
            System.out.println("Вы победили! Загаданное число: " + hiddenNumber);
        }
    }
}
