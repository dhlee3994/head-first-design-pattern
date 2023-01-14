package dhlee.study.dp_01_strategy.v2;

class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("조용~");
    }
}
