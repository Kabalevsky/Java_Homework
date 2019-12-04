public class Task4 { //  Задание №4
    public static void main(String args[]) {
        System.out.println(("Сумма значений переменных в пределах от 10 до 20 : " + summ(5, 11)));
    }

    public static boolean summ(int a, int b) {
        return (10 <= (a + b) && (a + b) <= 20);
    }
}