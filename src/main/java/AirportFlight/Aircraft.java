package AirportFlight;

import lombok.Getter;
import lombok.Setter;

public class Aircraft {

    //CREATE VARIABLES AND USING LAMBOK TO CREATE METHOD
    @Getter @Setter
    String model;

    @Getter @Setter
    int capacity;

    @Getter @Setter
    boolean rangeTanks;
}
