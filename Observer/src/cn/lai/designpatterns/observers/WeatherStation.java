package cn.lai.designpatterns.observers;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        WeatherData2 wd2 = new WeatherData2();
//        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);
        CurrentConditionsDisplay2 ccd2 = new CurrentConditionsDisplay2(wd2);
//        StatisticsDisplay sd = new StatisticsDisplay(wd);
        StatisticsDisplay2 sd = new StatisticsDisplay2(wd2);
        //WeatherData是一个Subject的具体实现类,主要WeatherData改变了,观察者就会被通知

//        wd.setMeasurements(100, 10, 3);
//        wd.setMeasurements(101, 500, 730);
//        wd.setMeasurements(102, 20, 3000);


        wd2.setMeasurements(100, 10, 3);
        wd2.setMeasurements(101, 500, 730);
        wd2.setMeasurements(102, 20, 3000);
    }
}