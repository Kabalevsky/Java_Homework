public class Task8 { //  Задание №8
    public static void main(String[]args) {
        int a = 300;
        if (a % 400 == 0) {
            System.out.println("Указан год " + a + ", этот год високосный.");
        } else if (a % 100 == 0) {
            System.out.println("Указан год " + a + ", этот год не високосный.");
        } else if (a % 4 == 0) {
            System.out.println("Указан год " + a + ", этот год високосный.");
        } else {
            System.out.println("Указан год " + a + ", этот год не високосный.");
        }
    }
}