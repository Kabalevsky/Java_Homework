import java.util.Random;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            Random random = new Random();
            int c = random.nextInt(10); // Компьютер генерирует случайное число
            System.out.println("Угадайте число от 0 до 9 с трех попыток.");
            for (int i = 3; i > 0; i--) { // Цикл трех попыток
                System.out.println("Введите свое число: ");
                int a = scanner.nextInt(); // Число, введенное пользователем
                if (a == c) {
                    System.out.println("Вы угадали число.");
                    break;
                }
                System.out.println(a > c ? "Введенное число меньше " : "Введенное число больше ");
                System.out.println((i - 1) > 0 ? " у вас осталось " + (i - 1) + " попыток." : "Попытки закончились, вы проиграли.");
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
            scanner.nextLine();
        }
        while (scanner.nextLine().equals("1")); // Возобновление цикла do при вводе пользователем 1
    }
}