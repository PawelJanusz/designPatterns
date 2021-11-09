package c_operational.observerForecast.notification;

import c_operational.observerForecast.weather.WeatherForecast;

public class InternetNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet - nowa prognoza pogody: " +
                "temperatura: " + weatherForecast.getTemperature() + "stopni, "
                + "ciśnienie: "+ weatherForecast.getPressure() + "hPa");
    }
}
