package cn.lai.designpatterns.observers;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        //存放观察者的列表
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) { this.observers.remove(o); }


    @Override
    public void notifyObserver() {

    }

    public float getTemperature() {
        return 0f;
    }

    public float getHumidity() {
        return 0f;
    }

    public float getPressure() {
        return 0f;
    }

    public void measurementsChanged() {

    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
