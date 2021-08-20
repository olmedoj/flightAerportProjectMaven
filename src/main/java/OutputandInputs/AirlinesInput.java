package OutputandInputs;

import AirportFlight.Airline;

import java.util.Scanner;

public class AirlinesInput {

    Airline airlineClass = new Airline();
    Scanner consola = new Scanner(System.in);

    //CREATE A METHOD TO INSER DATA ABOUT AIRLINE
    public Airline insertAirline(){

        System.out.println("====AIRLINE====");

        System.out.println("==============================");

        System.out.print("Enter the Airline Name" + " ");
        airlineClass.setName(consola.nextLine());

        System.out.print("Enter the code: " + " ");
        airlineClass.setCode(consola.nextLine());

        System.out.print("Enter the craft: " + " ");
        airlineClass.setAircraft(consola.nextLine());

        System.out.println("==============================");

        return airlineClass;

    }

    //CREATE A METHOD TO SHOW DATA ABOUT AIRLINE

    public Airline showDataAirline(){

        System.out.println("SHOWING DATA ABOUT AIRLINE");
        System.out.println("==============================");
        System.out.println("Name: " + airlineClass.getName());
        System.out.println("Code: " + airlineClass.getCode());
        System.out.println("Aircraft: " + airlineClass.getAircraft());
        System.out.println("==============================");

        return airlineClass;
    }

}
