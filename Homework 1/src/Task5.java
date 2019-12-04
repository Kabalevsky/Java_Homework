public class Task5 { //  Задание №5
    public static void main(String[] args) {
        System.out.println(positiveOrNegative(0));
    }

    public static String positiveOrNegative(int a) {
        if (a >= 0) {
            return ("Число положительное");
        } else {
            return ("Число отрицательное");
        }
    }
}
