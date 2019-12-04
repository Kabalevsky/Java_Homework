public class Task3 { //  Задание №3
    public static void main(String[] args) {
        System.out.println(math(15.73F, 20.61F, 25.36F, 30.55F));
    }

    public static float math(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
}
