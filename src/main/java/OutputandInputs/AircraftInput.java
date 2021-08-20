package OutputandInputs;

import AirportFlight.Aircraft;

import java.util.Scanner;

public class AircraftInput {
    Aircraft aircraft = new Aircraft();
    Scanner consola = new Scanner(System.in);

    public Aircraft insertDataAircraft(){

        System.out.println("===AIRCRAFT===");

        System.out.println("==============================");

        System.out.println("Enter Model");
        aircraft.setModel(consola.nextLine());

        System.out.println("Enter Capacity");
        aircraft.setCapacity(consola.nextInt());

        System.out.println("Enter Range Tanks");
        aircraft.setRangeTanks(consola.nextBoolean());

        System.out.println("==============================");

        return aircraft;
    }

    public Aircraft showDataAircraft(){

        System.out.println("===SHOWING DATA ABOUT AIRCRAFT===");
        System.out.println("==============================");
        System.out.println("Model: " + aircraft.getModel());
        System.out.println("Capacity: " + aircraft.getCapacity());
        System.out.println("Tanks:" +  aircraft.isRangeTanks());

        System.out.println("==============================");

        return aircraft;
    }

}
