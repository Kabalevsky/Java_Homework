import java.util.Random;

class Cat {
    Random random = new Random();
    private String name;
    private int appetite;
    private boolean hunger;

    Cat(String name) {
        this.name = name;
// При запуске программы аппетит каждого кота определяется с помощью генератора случайных чисел.
        this.appetite = random.nextInt(50);
        this.hunger = true;
    }
    void info() {
        String hungry = !hunger ? "сыт" : "голоден";
        System.out.println(name + " ест " + appetite + "гр." + ": кот " + hungry);
    }
    void eat(Plate plate) {
        if (hunger && plate.decreaseFood(appetite))
            hunger = false;
    }
}
class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;
        food -= n;
        return true;
    }
//Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    void addFood(int food) {
        this.food += food;
        System.out.println("В тарелку добавлено " + food + "гр.");
    }
    void info() {
        System.out.println("Остаток еды в тарелке: " + food + "гр.");
    }
}
public class Task1 {
    public static
    void main(String[] args) {
//Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
        Cat[] cats = {new Cat("Маркус"), new Cat("Аксель"), new Cat("Пузик"), new Cat("Мурзик"), new Cat("Барсик")};
        Plate plate = new Plate( 100);
        for (Cat cat : cats) {
            plate.info();
            cat.eat(plate);
            cat.info();
        }
        plate.info();
        plate.addFood(30);
        plate.info();
    }
}