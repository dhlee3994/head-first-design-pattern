package dhlee.study.dp_01_strategy.v2;

abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void display();

    protected void fly() {
        flyBehavior.fly();
    }

    protected void quack() {
        quackBehavior.quack();
    }

    protected void swim() {
        System.out.println("첨벙");
    }
}
