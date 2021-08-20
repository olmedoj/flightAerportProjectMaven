package OutputandInputs;

import AirportFlight.Airport;

import java.util.Scanner;

public class AirportInputs {

        Airport airport = new Airport();

    public  Airport  insertDataAirport(){

        Scanner consola = new Scanner(System.in);

        System.out.println("====AIRPORT====");

        System.out.println("==============================");

        System.out.println("Option 1 Insert Airport");

        System.out.print("Enter ID");
        airport.setId(consola.nextLine());

        System.out.print("Enter Name");
        airport.setName(consola.nextLine());

        System.out.print("Enter Country of Origin");
        airport.setCountry(consola.nextLine());

        System.out.print("Enter city of origin");
        airport.setCity(consola.nextLine());

        System.out.println("==============================");



        return airport;

    }

    public  Airport  getDatAirport(){

        System.out.println("Showing Airport Data");
        System.out.println("==============================");
        System.out.println("ID: " + airport.getId());
        System.out.println("Country: " + airport.getCountry());
        System.out.println("City: " + airport.getCity());
        System.out.println("==============================");

        return airport;

    }
}
