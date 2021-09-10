package OutputandInputs;

import AirportFlight.Airport;

import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;


class AirportInputsTest {

    AirportInputs airportInputs = new AirportInputs();

    @org.junit.jupiter.api.Test
    void testGetDatAirport() {
        Airport listAirport = airportInputs.getDatAirport();
        listAirport.setId("1515");
        listAirport.setName("Aeropuerto El Salvador");
        listAirport.setCity("La Paz");
        listAirport.setCountry("El Salvador");


        assertTrue(airportInputs.getDatAirport() == listAirport);
    }
}