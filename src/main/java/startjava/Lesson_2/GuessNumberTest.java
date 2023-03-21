package startjava.Lesson_2;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String responseContinue;
        System.out.println("Введите имя первого игрока:");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока:");
        Player player2 = new Player(scanner.nextLine());
        do {
            GuessNumber guessNumber = new GuessNumber(player1, player2);
            guessNumber.startTheGame();
            do {
                System.out.println("Вы желаете повторить игру?");
                responseContinue = scanner.nextLine();
            } while (!responseContinue.equals("yes") && !responseContinue.equals("no"));
        } while (!responseContinue.equals("no"));
    }
}
