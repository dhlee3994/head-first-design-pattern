package dhlee.study.dp_01_strategy.v1;

class RedheadDuck extends Duck{
    @Override
    void quack() {
        System.out.println("꽉");
    }
    @Override
    void display() {
        System.out.println("Redhead Duck!");
    }
    @Override
    void fly() {
        System.out.println("파닥파닥");
    }
}
