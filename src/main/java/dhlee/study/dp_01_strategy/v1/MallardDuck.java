package dhlee.study.dp_01_strategy.v1;

class MallardDuck extends Duck {
    @Override
    void quack() {
        System.out.println("꽉");
    }
    @Override
    void display() {
        System.out.println("Mallard Duck!");
    }

    @Override
    void fly() {
        System.out.println("파닥파닥");
    }
}
