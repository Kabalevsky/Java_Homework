public class Task1 { // Задание 1.
    public static void main(String args[]) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 1) ? 0 : 1; // Тернарный оператор
            System.out.print(array[i] + " ");
        }
    }
}