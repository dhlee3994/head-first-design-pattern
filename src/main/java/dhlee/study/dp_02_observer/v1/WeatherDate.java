package dhlee.study.dp_02_observer.v1;

class WeatherDate {

    private float temperature;
    private float humidity;
    private float pressure;

    private CurrentConditionsDisplayElement currentConditionsDisplay;
    private StatisticsDisplayElement statisticsDisplay;
    private ForecastDisplayElement forecastDisplay;

    WeatherDate(final float temperature, final float humidity, final float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        currentConditionsDisplay = new CurrentConditionsDisplayElement();
        statisticsDisplay = new StatisticsDisplayElement();
        forecastDisplay = new ForecastDisplayElement();
    }

    void measurementsChanged() {
        currentConditionsDisplay.display(temperature, humidity, pressure);
        statisticsDisplay.display(temperature, humidity, pressure);
        forecastDisplay.display(temperature, humidity, pressure);
    }
}
