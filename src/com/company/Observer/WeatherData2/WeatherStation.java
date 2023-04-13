package com.company.Observer.WeatherData2;

public class WeatherStation {
    public static void main(String[] args) {
        /*数据源和观察者都要维护一个 中介角色WeatherData*/
        WeatherData weatherdata = new WeatherData();

        /*以下为测试所用而创建3个观察者，并非数据源的作用*/
        ConditionDisplay cd1 = new ConditionDisplay(weatherdata,"观察站1");

        /*数据源获得数据，并调用WeatherData的方法，来向WeatherData 写数据*/
        weatherdata.setMeasurements(10.5, 10.4, 10.8);
    }
}
