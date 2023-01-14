package dhlee.study.dp_01_strategy.v2;

class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("아무것도 안해요");
    }
}
