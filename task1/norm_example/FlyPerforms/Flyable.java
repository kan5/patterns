package task1.norm_example.FlyPerforms;

import task1.norm_example.FlyBehavior;

public class Flyable implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
