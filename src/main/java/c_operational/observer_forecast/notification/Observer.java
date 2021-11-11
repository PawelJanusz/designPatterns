package c_operational.observer_forecast.notification;

import c_operational.observer_forecast.weather.WeatherForecast;

public interface Observer {

        void updateForecast(WeatherForecast weatherForecast);
}
