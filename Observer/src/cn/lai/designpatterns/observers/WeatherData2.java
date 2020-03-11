package cn.lai.designpatterns.observers;

import java.util.ArrayList;
import java.util.Observable;

/**
 * 具体的主题
 */
public class WeatherData2 extends Observable {


    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData2() {

    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        super.setChanged();
        super.notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }
}
