package OutputandInputs;

import AirportFlight.Airport;

public class AirportInputs {

        Airport airport = new Airport();
        Handler consola = new Handler();

    public  Airport  insertDataAirport(){

        System.out.println("====AIRPORT====");
        consola.printlines();

        System.out.println("Option 1 Insert Airport: ");

        System.out.print("Enter ID: ");
        airport.setId(consola.Read().nextLine());

        System.out.print("Enter Name: ");
        airport.setName(consola.Read().nextLine());

        System.out.print("Enter Country of Origin: ");
        airport.setCountry(consola.Read().nextLine());

        System.out.print("Enter city of origin: ");
        airport.setCity(consola.Read().nextLine());

        consola.printlines();
        return airport;

    }

    public  Airport  getDatAirport(){

        System.out.println("Showing Airport Data");
        consola.printlines();
        System.out.println("ID: " + airport.getId());
        System.out.println("Country: " + airport.getCountry());
        System.out.println("City: " + airport.getCity());
        consola.printlines();

        return airport;

    }
}
