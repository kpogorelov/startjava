package org.example;

public class MyFirstGame {
    public static void main(String[] args) {
        int hiddenNumber = 100;
        int myAnswerNumber = 110;
        if (hiddenNumber > 0 && hiddenNumber <= 100) {
            while (hiddenNumber != myAnswerNumber) {
                if (hiddenNumber > myAnswerNumber) {
                    System.out.println("Число " + myAnswerNumber + " меньше чем то что загадал компьютер");
                    myAnswerNumber++;

                } else {
                    System.out.println("Число " + myAnswerNumber + " больше чем то что загадал компьютер");
                    myAnswerNumber--;
                }
            }
            if (myAnswerNumber == hiddenNumber) {
                System.out.println("Вы победили! Загаданное число: " + hiddenNumber);
            }
        }
    }
}
