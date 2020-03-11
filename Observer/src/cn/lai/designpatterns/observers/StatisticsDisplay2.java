package cn.lai.designpatterns.observers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;

/***
 * 统计最大最小值
 */
public class StatisticsDisplay2 implements DisplayElement, Observer {
    private Observable wd;
    private ArrayList<Float> temperature = new ArrayList<>();
    private ArrayList<Float> humidity = new ArrayList<>();
    private ArrayList<Float> pressure = new ArrayList<>();

    public StatisticsDisplay2(Observable wd) {
        this.wd = wd;
        wd.addObserver(this);
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
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData2) {
            this.temperature.add(((WeatherData2) o).getTemperature());
            this.humidity.add(((WeatherData2) o).getHumidity());
            this.pressure.add(((WeatherData2) o).getPressure());
        display();
        }
    }
}
