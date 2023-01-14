package dhlee.study.dp_01_strategy.v1;

abstract class Duck {
    abstract void quack();
    abstract void display();
    abstract void fly();
    protected void swim(){
        System.out.println("첨벙");
    }
}
