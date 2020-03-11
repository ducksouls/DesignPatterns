package cn.lai.designpatterns.observers;

/**
 * 显示当前数值,是一个"关心"天气数据的观察者
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    CurrentConditionsDisplay(Subject s) {
        this.weatherData = s;
        //注册主题
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
