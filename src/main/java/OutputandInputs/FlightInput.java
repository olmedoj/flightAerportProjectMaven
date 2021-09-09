package OutputandInputs;

import AirportFlight.Flight;

public class FlightInput {

    Flight flight = new Flight();
    Handler consola = new Handler();

    public Flight insertDataFlight(){
        System.out.println("====FLIGHT====");

        System.out.print("Enter ID: " + " ");
        flight.setId(consola.Read().nextLine());

        System.out.print("Enter Country of Origin" + " ");
        flight.setCountryOrigin(consola.Read().nextLine());

        System.out.print("Enter Destination" + " ");
        flight.setDestination(consola.Read().nextLine());

        System.out.print("Enter Airline: " + " ");
        flight.setAirline(consola.Read().nextLine());

        return flight;
    }


    public Flight ShowDataFlight(){

        System.out.println("SHOWING DATA ABOUT FLIGHT");
        consola.printlines();

        System.out.println("ID: " + flight.getId());
        System.out.println("Country of Origin: " + flight.getCountryOrigin());
        System.out.println("Destination: " + flight.getDestination());
        System.out.println("Airline: " + flight.getAirline());
        consola.printlines();


        return flight;
    }
}
