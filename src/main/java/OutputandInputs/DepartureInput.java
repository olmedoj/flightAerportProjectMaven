package OutputandInputs;

import AirportFlight.DepartureArrivalInfo;


import java.util.Scanner;

public class DepartureInput {
    DepartureArrivalInfo departure = new DepartureArrivalInfo();
    Scanner consola = new Scanner(System.in);

    public  DepartureArrivalInfo insertDepartures(){

        System.out.println("====DEPARTURES AND ARRIVAL INFO====");

        System.out.println("==============================");

        System.out.println("Enter Day of week");
        departure.setDayOfWeek(consola.nextLine());

        System.out.println("Enter Time");
        departure.setTime(consola.nextLine());

        System.out.println("Enter Departure Time");
        departure.setDepartureTime(consola.nextLine());

        System.out.println("Enter Arrival Time");
        departure.setArrivalTime(consola.nextLine());

        System.out.println("==============================");


        return departure;
    }

    public  DepartureArrivalInfo showDataDeparture(){

        System.out.println("SHOWING DATA ABOUT DEPARTURES AN ARRIVAL INFO");

        System.out.println("==============================");

        System.out.println( "Day of week: " + departure.getDayOfWeek());
        System.out.println("Time: " + departure.getTime());
        System.out.println("Departure Tme: " + departure.getDepartureTime());
        System.out.println("Arrival Time: " + departure.getArrivalTime());

        System.out.println("==============================");

        return departure;
    }

}
