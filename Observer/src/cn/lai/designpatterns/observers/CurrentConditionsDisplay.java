package cn.lai.designpatterns.observers;

/**
 * 显示当前数值
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    CurrentConditionsDisplay(Subject s) {
        this.weatherData = s;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current temperature is : " + this.temperature + "--- Current humidity is : " + this.humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.display();
    }
}
