package cn.lai.designpatterns.observers;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);

        wd.setMeasurements(100, 20, 30);
        wd.setMeasurements(101, 20, 30);
        wd.setMeasurements(102, 20, 30);

    }
}