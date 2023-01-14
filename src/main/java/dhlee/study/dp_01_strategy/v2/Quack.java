package dhlee.study.dp_01_strategy.v2;

class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("꽉!");
    }
}
