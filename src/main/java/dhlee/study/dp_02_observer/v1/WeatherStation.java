package dhlee.study.dp_02_observer.v1;

class WeatherStation {

    public static void main(String[] args) {
        final WeatherDate weatherDate = new WeatherDate(5.7f, 57.3f, 1.0f);

        weatherDate.measurementsChanged();
    }
}
