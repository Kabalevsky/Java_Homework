public class Task8 { //  Задание №8
    public static void main(String[] args) {
        System.out.println ("Год " + year(100));
    }

    public static String year(int a) {
        String result;
        if (a % 400 == 0 && a % 4 == 0) {
            result = "високосный";
        } else {
            result = "не високосный";
        }
        return result;
    }
}