package c_operational.observerForecast.weather;

import c_operational.observerForecast.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable, Observer{

    private int temperature;
    private int pressure;
    private final Set<Observer> registeredObservers = new HashSet<>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: registeredObservers){
            observer.updateForecast(this);
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public Set<Observer> getRegisteredObservers() {
        return registeredObservers;
    }

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        setTemperature(weatherForecast.temperature);
        setPressure(weatherForecast.pressure);
        notifyObservers();
    }
}
