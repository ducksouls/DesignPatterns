package cn.lai.designpatterns.observers;
import java.util.Observable;
import java.util.Observer;

/**
 * 显示当前数值,是一个"关心"天气数据的观察者
 */
public class CurrentConditionsDisplay2 implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Observable weatherData2;

    CurrentConditionsDisplay2(Observable s) {
        this.weatherData2 = s;
        //注册主题
        this.weatherData2.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current temperature is : " + this.temperature + "--- Current humidity is : " + this.humidity);
    }


//    public void update(float temperature, float humidity, float pressure) {
//        this.temperature = temperature;
//        this.humidity = humidity;
//        this.display();
//    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData2) {
            WeatherData2 wd2 = (WeatherData2)o;
            humidity = wd2.getHumidity();
            temperature = wd2.getTemperature();
            display();
        }
    }
}
