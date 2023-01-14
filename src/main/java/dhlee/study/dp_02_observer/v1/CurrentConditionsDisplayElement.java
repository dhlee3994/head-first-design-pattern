package dhlee.study.dp_02_observer.v1;

class CurrentConditionsDisplayElement implements DisplayElement {

    @Override
    public void display(float temperature, float humidity, float pressure) {
        System.out.println("현재 날씨상황: 온도 - " + temperature + ", 습도 - " + humidity + ", 기압 - " + pressure);
    }
}
