package OutputandInputs;

import static org.junit.jupiter.api.Assertions.*;


class AirportInputsTest {

    AirportInputs airportInputs = new AirportInputs();

    @org.junit.jupiter.api.Test
    void testGetDatAirport() {

        assertTrue(airportInputs.getDatAirport() != null,"El arreglo no viene vacio");
    }
}