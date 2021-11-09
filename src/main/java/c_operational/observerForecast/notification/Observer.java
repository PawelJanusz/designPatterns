package c_operational.observerForecast.notification;

import c_operational.observerForecast.weather.WeatherForecast;

public interface Observer {

        void updateForecast(WeatherForecast weatherForecast);
}
