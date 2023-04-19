package startjava.lesson_2_3_4;

import startjava.lesson_2_3_4.guess.Player;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Player player = new Player("Alex");
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (true) {
            i++;
            System.out.println("Введите число");
            player.setNumbers(scanner.nextInt());
            scanner.nextLine();
            if (i == 20) {
                break;
            }
        }
        System.out.println(Arrays.toString(player.getNumbers()));
    }
}
