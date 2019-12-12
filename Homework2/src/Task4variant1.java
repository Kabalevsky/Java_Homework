public class Task4variant1 { // Задание №4, вариант 1
    public static void main(String args[]) {
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, k = array[i].length; j < array[i].length; j++, k--) {
                if (i == j || i == (k - 1)) array[i][j] = 1;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}