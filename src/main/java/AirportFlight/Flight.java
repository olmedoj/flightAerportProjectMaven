package AirportFlight;


import lombok.Getter;
import lombok.Setter;

public class Flight {

    //CREATE VARIABLES AND USING LOMBOK TO CREATE METHOD
    @Getter @Setter private String id;
    @Getter @Setter private String countryOrigin;
    @Getter @Setter private String destination;
    @Getter @Setter private String airline;
}
