package dhlee.study.dp_02_observer.v1;

class StatisticsDisplayElement implements DisplayElement {

    @Override
    public void display(float temperature, float humidity, float pressure) {
        System.out.println("기상 통계: 온도 - " + temperature + ", 습도 - " + humidity + ", 기압 - " + pressure);
    }
}
