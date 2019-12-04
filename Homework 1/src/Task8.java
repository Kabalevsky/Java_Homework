public class Task8 { //  Задание №8
    public static void main(String[] args) {
        System.out.println(year(1984));
    }

    public static String year(int a) {
        if (a % 400 == 0) {
            return ("Указан год " + a + ", этот год високосный.");
        } else if (a % 100 == 0) {
            return ("Указан год " + a + ", этот год не високосный.");
        } else if (a % 4 == 0) {
            return ("Указан год " + a + ", этот год високосный.");
        } else {
            return ("Указан год " + a + ", этот год не високосный.");
        }
    }
}