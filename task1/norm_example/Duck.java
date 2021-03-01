package task1.norm_example;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    Duck() {}

    public abstract void display();

    public void swim() { System.out.println("Плав-плав"); }

    void flyPerform(){
        flyBehavior.fly();
    }

    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    void quackPerform(){
        quackBehavior.quack();
    }

    void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
