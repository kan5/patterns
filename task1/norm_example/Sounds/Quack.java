package task1.norm_example.Sounds;

import task1.norm_example.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Кря!");
    }
}
