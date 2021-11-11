package c_operational.observer_forecast.weather;

import c_operational.observer_forecast.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();

}
