import java.util.Scanner;
public class GameGuessNumber {
    Scanner scanner;

    public static void main(String[] args) {
        new GameGuessNumber().gameLogic();
    }

    GameGuessNumber() {
        scanner = new Scanner(System.in);
    }

    void gameLogic() {
        int y = (int) (Math.random() * 100);
        System.out.println("Я загадал целое число от 1 до 100, угадывай, брат");
        int x;
        int tryCount = 1;
        x = scanner.nextInt();
        if (x < y) {
            System.out.println("Я сам в шоке, но, загаданное число больше, брат");
        } else if (x > y) {
            System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
        }
        while (x != y) {
            x = scanner.nextInt();
            tryCount += 1;
            if (x < y) {
                System.out.println("Я сам в шоке, но, загаданное число больше, брат");
            } else if (x > y) {
                System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
            }
        }
        System.out.println("Я загадал " + y);
        System.out.println("Ты справился с " + tryCount + " попытки");
    }
}


