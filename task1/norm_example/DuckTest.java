package task1.norm_example;

import task1.norm_example.Sounds.Gav;

public class DuckTest {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.flyPerform();
        rubberDuck.quackPerform();
        Duck normDuck = new NormDuck();
        normDuck.flyPerform();
        normDuck.quackPerform();
        normDuck.setQuackBehavior(new Gav());
        normDuck.quackPerform();
    }
}
