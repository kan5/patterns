package task1.norm_example;

import task1.norm_example.FlyPerforms.Unflyable;
import task1.norm_example.Sounds.Chru;

public class RubberDuck extends Duck {

    RubberDuck() {
        quackBehavior = new Chru();
        flyBehavior = new Unflyable();
    }
    @Override
    public void display() {
        System.out.println("I'm rubber duck");
    }
}
