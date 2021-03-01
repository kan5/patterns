package task1.norm_example.FlyPerforms;

import task1.norm_example.FlyBehavior;

public class Unflyable implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly!((");
    }
}
