package OutputandInputs;

import AirportFlight.FlightSchedule;

import java.util.ArrayList;
import java.util.List;

public class WeatherInput {

    List<String> listWeather = new ArrayList<>();

    public List<String> WeatherInput(){
        listWeather.add("Clear sky, winds of 30 k / m, temperature 30 ° C");
        listWeather.add("Cloudy, 35 k / m winds, temperature 25 ° C");
        listWeather.add("Rainy, 45 k / m winds, temperature 20 ° C");

        return listWeather;

    }
    public void ShowWeather() {
        for (int x = 0;x < listWeather.size();x++){
            System.out.println(listWeather.get(x));
        }
    }

    public void addWeather(){
        FlightSchedule add = new FlightSchedule();
        System.out.println("Que clima desea agregar: ");
        System.out.println(listWeather);
        add.setCurrentTime(listWeather.get(0));
    }

}
