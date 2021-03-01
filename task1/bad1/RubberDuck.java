package task1.bad1;

public class RubberDuck extends Duck {
    @Override
    void display() {
        System.out.println("Смотрите, я резиновая утка!");
    }

    @Override
    void quack() {
        System.out.println("Хрю-хрю");
    }

    @Override
    void fly() {}
}
