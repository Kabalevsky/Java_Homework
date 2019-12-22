import java.util.Random;

class Animal {
private int MaxRun;
private float MaxJump;
private int MaxSwim;
Random random = new Random();
// Добавлен генератор случайных чисел, каждый раз при запуске программы генерируются значения и сравниваются с максимальными
// значениями для бега, прыжка и плавания, в зависимости от результата выводится true или false.
    public void run() {
        int run = random.nextInt(300);
        System.out.println("Животное пробежало " + run + "м" + " : " + (run <= MaxRun));
    }
    public void jump() {
        float jump = random.nextInt(5);
        System.out.println("Животное прыгнуло " + jump + "м" + " : " + (jump <= MaxJump));
    }
    public void swim() {
        int swim = random.nextInt(30);
        System.out.println("Животное проплыло " + swim + "м" + " : " + (swim <= MaxSwim));
    }
    public Animal (int MaxRun, float MaxJump, int MaxSwim){
this.MaxRun = MaxRun;
this.MaxJump = MaxJump;
this.MaxSwim = MaxSwim;
    }
}
class Cat extends Animal {
    public Cat(int run, float jump, int swim) {
        super(run, jump, swim);
    }
}
class Dog extends Animal {
    public Dog(int run, float jump, int swim) {
        super(run, jump, swim);
    }
}

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Кошка: ");
        Animal cat = new Cat(200, 2F,0);
        cat.run();
        cat.jump();
        cat.swim();

        System.out.println("Собака: ");
        Animal dog = new Dog(500,  0.5F,10);
        dog.run();
        dog.jump();
        dog.swim();
    }
}