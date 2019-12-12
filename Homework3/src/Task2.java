import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner scanner = new Scanner(System.in);
        String a;
        Random random = new Random();
        String word = words[random.nextInt(words.length)];
        System.out.println(Arrays.toString(words));
        System.out.println("Угадайте слово.");
        do {
            System.out.print("Введите свое слово: ");
            a = scanner.next();
            for (int i = 0; i < 15; i++)
                if (i < word.length() && i < a.length() &&
                        word.charAt(i) == a.charAt(i))
                    System.out.print(word.charAt(i));
                else
                    System.out.print((word.equals(a)) ? "" : "#");
            System.out.println();
        } while (!word.equals(a));
        System.out.println("Вы угадали.");
    }
}

