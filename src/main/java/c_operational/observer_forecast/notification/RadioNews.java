package c_operational.observer_forecast.notification;

import c_operational.observer_forecast.weather.WeatherForecast;

public class RadioNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody: " +
                "temperatura: " + weatherForecast.getTemperature() + "stopni, "
                + "ciśnienie: "+ weatherForecast.getPressure() + "hPa");
    }
}
