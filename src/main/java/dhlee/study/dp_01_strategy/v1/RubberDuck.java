package dhlee.study.dp_01_strategy.v1;

class RubberDuck extends Duck {

    @Override
    void quack() {
        System.out.println("삑삑");
    }
    @Override
    void display() {
        System.out.println("Rubber Duck!");
    }
    @Override
    void fly() {
        System.out.println("아무것도 안해요");
    }
}
