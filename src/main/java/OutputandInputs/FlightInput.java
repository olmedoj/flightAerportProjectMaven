package OutputandInputs;

import AirportFlight.Flight;

import java.util.Scanner;

public class FlightInput {

    Flight flight = new Flight();
    Scanner consola = new Scanner(System.in);

    public Flight insertDataFlight(){
        System.out.println("====FLIGHT====");

        System.out.print("Enter ID: " + " ");
        flight.setId(consola.nextLine());

        System.out.print("Enter Country of Origin" + " ");
        flight.setCountryOrigin(consola.nextLine());

        System.out.print("Enter Destination" + " ");
        flight.setDestination(consola.nextLine());

        System.out.print("Enter Airline: " + " ");
        flight.setAirline(consola.nextLine());

        return flight;
    }


    public Flight ShowDataFlight(){

        System.out.println("SHOWING DATA ABOUT FLIGHT");

        System.out.println("==============================");

        System.out.println("ID: " + flight.getId());
        System.out.println("Country of Origin: " + flight.getCountryOrigin());
        System.out.println("Destination: " + flight.getDestination());
        System.out.println("Airline: " + flight.getAirline());

        System.out.println("==============================");


        return flight;
    }
}
