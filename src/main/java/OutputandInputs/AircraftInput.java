package OutputandInputs;

import AirportFlight.Aircraft;

public class AircraftInput {
    Aircraft aircraft = new Aircraft();
    Handler consola = new Handler();

    //Metho to insert aircraft
    public Aircraft insertDataAircraft(){

        System.out.println("===AIRCRAFT===");
        consola.printlines();
        System.out.print("Enter Model: ");
        aircraft.setModel(consola.Read().nextLine());

        System.out.print("Enter Capacity: ");
        aircraft.setCapacity(consola.Read().nextInt());

        System.out.print("Enter Range Tanks: ");
        aircraft.setRangeTanks(consola.Read().nextBoolean());
        consola.printlines();

        return aircraft;
    }

    public Aircraft showDataAircraft(){

        System.out.println("===SHOWING DATA ABOUT AIRCRAFT===");
        consola.printlines();
        System.out.println("Model: " + aircraft.getModel());
        System.out.println("Capacity: " + aircraft.getCapacity());
        System.out.println("Tanks:" +  aircraft.isRangeTanks());
        consola.printlines();

        return aircraft;
    }

}
