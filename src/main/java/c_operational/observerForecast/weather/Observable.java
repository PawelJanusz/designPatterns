package c_operational.observerForecast.weather;

import c_operational.observerForecast.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();

}
