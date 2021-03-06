package cn.lai.designpatterns.observers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/***
 * 统计最大最小值
 */
public class StatisticsDisplay implements DisplayElement, Observer {
    private WeatherData wd;
    private ArrayList<Float> temperature = new ArrayList<>();
    private ArrayList<Float> humidity = new ArrayList<>();
    private ArrayList<Float> pressure = new ArrayList<>();

    public StatisticsDisplay(WeatherData wd) {
        wd.registerObserver(this);
    }


    @Override
    public void display() {
        if (this.temperature.size() > 0 ) {
            System.out.println("最大气温: " + Collections.max(this.temperature) + "...");
            System.out.println("最大气压: " + Collections.max(this.pressure) + "...");
            System.out.println("最大湿度: " + Collections.max(this.humidity) + "...");
        } else {
            System.out.println("还没有更新数据...");
        }
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature.add(temperature);
        this.humidity.add(humidity);
        this.pressure.add(pressure);
        display();
    }
}
