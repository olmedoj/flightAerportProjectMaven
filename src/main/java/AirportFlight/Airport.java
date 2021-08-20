package AirportFlight;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class Airport {
    //CREATE VARIABLES AND USING LAMBOK TO CREATE METHOD
    @Getter @Setter
    private String id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String country;

    @Getter @Setter
    private String city;

    @Getter @Setter
    private Airline airlinesList[] = new Airline[10];

    @Getter @Setter
    private int airlinesNumber;





}
