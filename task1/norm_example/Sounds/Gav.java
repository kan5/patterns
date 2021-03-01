package task1.norm_example.Sounds;

import task1.norm_example.QuackBehavior;

public class Gav implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Гав!");
    }
}
