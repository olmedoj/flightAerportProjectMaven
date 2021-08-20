package AirportFlight;

import lombok.Getter;
import lombok.Setter;

public class DepartureArrivalInfo {

    //CREATE VARIABLES AND USING LAMBOK TO CREATE METHOD
    @Getter @Setter
    String dayOfWeek;

    @Getter @Setter
    String time;

    @Getter @Setter
    String airportCode;

    @Getter @Setter
    String date;

    @Getter @Setter
    String departureTime;

    @Getter @Setter
    String arrivalTime;
}
