package dhlee.study.dp_02_observer.v2;

 class WeatherStation {

  public static void main(String[] args) {
   final WeatherData weatherData = new WeatherData();

   final CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

   weatherData.setMeasurements(5.7f, 57.2f, 1.0f);
  }
}
