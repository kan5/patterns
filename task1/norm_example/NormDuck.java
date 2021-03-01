package task1.norm_example;

import task1.norm_example.FlyPerforms.Flyable;
import task1.norm_example.Sounds.Quack;

public class NormDuck extends Duck {
    NormDuck() {
        flyBehavior = new Flyable();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {

    }
}
