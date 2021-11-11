package c_operational.observer_forecast;

import c_operational.observer_forecast.notification.InternetNews;
import c_operational.observer_forecast.notification.RadioNews;
import c_operational.observer_forecast.notification.TvNews;
import c_operational.observer_forecast.weather.WeatherForecast;

public class Main {

    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(18, 998);
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifyObservers();
        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);
        System.out.println("Nowa prognoza - powiadomienie tylko dla serwisu internetowego:");
        weatherForecast.updateForecast(new WeatherForecast(23, 1030));
    }
}
