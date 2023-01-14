package dhlee.study.dp_02_observer.v1;

class ForecastDisplayElement implements DisplayElement {

    @Override
    public void display(float temperature, float humidity, float pressure) {
        System.out.println("일기예보: 온도 - " + temperature + ", 습도 - " + humidity + ", 기압 - " + pressure);
    }
}
