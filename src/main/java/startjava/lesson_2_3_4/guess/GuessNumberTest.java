package startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String console;
        System.out.println("Введите через пробел имена игроков которые будут принимать участие в игре: ");
        GuessNumber game = new GuessNumber(scanner.nextLine());
        do {
            game.start();
            do {
                System.out.println("Вы желаете повторить игру? <yes/no>");
                console = scanner.nextLine();
            } while (!console.equals("yes") && !console.equals("no"));
        } while (!console.equals("no"));
        scanner.close();
    }
}
