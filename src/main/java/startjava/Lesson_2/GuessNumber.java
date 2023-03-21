package startjava.Lesson_2;

import java.util.Scanner;

public class GuessNumber {
    private static int computerNumber = (int) (1 + Math.random() * 100);
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public int getComputerNumber() {
        return computerNumber;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void startTheGame() {
        while (true) {
            if (!GuessNumber.checkPlayerNumber(player1) || !GuessNumber.checkPlayerNumber(player2)) {
                break;
            }
        }
    }

    public static boolean checkPlayerNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + " Введите ваше число");
        player.setMyNumber(scanner.nextInt());
        scanner.nextLine();
        if (player.getMyNumber() == computerNumber) {
            System.out.println(player.getName() + " вы победили!!!");
            return false;
        } else if (player.getMyNumber() > computerNumber) {
            System.out.println("Вы ввели число больше");
        } else {
            System.out.println("Вы ввели число меньше");
        }
        return true;
    }
}

