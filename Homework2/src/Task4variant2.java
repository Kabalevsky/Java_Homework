public class Task4variant2 { // Задание №4, вариант 2
    public static void main(String args[]) {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, k = array[i].length; j < array[i].length; j++, k--) {
                if (i == j || i == (k + j)) array[i][j] = 1;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}