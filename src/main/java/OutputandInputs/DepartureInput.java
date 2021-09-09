package OutputandInputs;

import AirportFlight.DepartureArrivalInfo;

public class DepartureInput {

    DepartureArrivalInfo departure = new DepartureArrivalInfo();
    Handler consola = new Handler();

    //Metho to insert departures
    public  DepartureArrivalInfo insertDepartures(){

        System.out.println("====DEPARTURES AND ARRIVAL INFO====");
        consola.printlines();

        System.out.print("Enter Day of week: ");
        departure.setDayOfWeek(consola.Read().nextLine());

        System.out.print("Enter Time: ");
        departure.setTime(consola.Read().nextLine());

        System.out.print("Enter Departure Time: ");
        departure.setDepartureTime(consola.Read().nextLine());

        System.out.print("Enter Arrival Time: ");
        departure.setArrivalTime(consola.Read().nextLine());
        consola.printlines();

        return departure;
    }
    //Metho to show Departures
    public  DepartureArrivalInfo showDataDeparture(){

        System.out.println("SHOWING DATA ABOUT DEPARTURES AN ARRIVAL INFO");

        consola.printlines();
        System.out.println( "Day of week: " + departure.getDayOfWeek());
        System.out.println("Time: " + departure.getTime());
        System.out.println("Departure Tme: " + departure.getDepartureTime());
        System.out.println("Arrival Time: " + departure.getArrivalTime());
        consola.printlines();

        return departure;
    }

}
