package com.company.Observer.WeatherData;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;
    private double temperature;
    private double humidity;
    private double pressure;

    /*当数据源初始化时，维护一个记录观察者的列表*/
    public WeatherData() {
        observers = new ArrayList();
    }
    /*实现Subject接口的注册方法*/
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    /*实现Subject接口的取消注册方法*/
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0) {
            observers.remove(i);
        }
    }

    /*实现Subject接口的notifyObservers()，用于向所有注册的观察者发送数据*/
    @Override
    public void notifyObservers() {
        for(int i=0;i<observers.size();i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /*当有新数据时，向注册的观察者发送数据*/
    public void measurementsChanged() {
        notifyObservers();
    }

    /*向获取数据的设备提供接口，当气象观察站获得新数据，会调用此接口向WeatherData写数据，以便WeatherData向观察者发送数据*/
    public void setMeasurements(double temp,double humditidy,double pressure) {
        this.temperature = temp;
        this.humidity = humditidy;
        this.pressure = pressure;
        measurementsChanged();		//表示有了新数据
    }
}
