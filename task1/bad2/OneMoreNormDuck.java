package task1.bad2;

public class OneMoreNormDuck extends Duck implements Flyable, Quackable {
    @Override
    void display() {
        System.out.println("Смотрите, я ещё одна нормальная утка!");
    }

    public void quack() {
        System.out.println("Ути-пути");
    }
    public void fly() {
        System.out.println("Машу крыльями");
    }

}