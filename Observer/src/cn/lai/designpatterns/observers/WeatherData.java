package cn.lai.designpatterns.observers;

public class WeatherData implements Subject {
    @Override
    public void registerObserver() {

    }

    @Override
    public void removeObserver() {

    }

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
}
