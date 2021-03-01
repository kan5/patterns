package task1.bad2;

public class RubberDuck extends Duck implements Quackable {

    public void quack()  {
        System.out.println("Хрю-хрю");
    }

    @Override
    void display() {
        System.out.println("Смотрите, я резиновая утка!");
    }
}
