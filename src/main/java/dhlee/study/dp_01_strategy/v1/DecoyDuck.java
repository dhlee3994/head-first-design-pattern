package dhlee.study.dp_01_strategy.v1;

class DecoyDuck extends Duck {

    @Override
    void quack() {
        System.out.println("조용~");
    }

    @Override
    void display() {
        System.out.println("Decoy Duck!");
    }

    @Override
    void fly() {
        System.out.println("아무것도 안해요");
    }
}
