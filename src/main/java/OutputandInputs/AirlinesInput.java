package OutputandInputs;

import AirportFlight.Airline;
import java.util.ArrayList;
import java.util.List;

public class AirlinesInput {

    Airline airlineClass = new Airline();
    Handler consola = new Handler();

    //CREATE A METHOD TO INSER DATA ABOUT AIRLINE

    public Airline insertAirline(){
        List<Airline> lst = new ArrayList<>();
        System.out.println("====AIRLINE====");
        consola.printlines();

        System.out.print("Enter the Airline Name" + " ");
        airlineClass.setName(consola.Read().nextLine());

        System.out.print("Enter the code: " + " ");
        airlineClass.setCode(consola.Read().nextLine());

        System.out.print("Enter the craft: " + " ");
        airlineClass.setAircraft(consola.Read().nextLine());

        consola.printlines();
        return airlineClass;
    }

    //CREATE A METHOD TO SHOW DATA ABOUT AIRLINE

    public Airline showDataAirline(){

        System.out.println("SHOWING DATA ABOUT AIRLINE");
        consola.printlines();
        System.out.println("Name: " + airlineClass.getName());
        System.out.println("Code: " + airlineClass.getCode());
        System.out.println("Aircraft: " + airlineClass.getAircraft());
        consola.printlines();

        return airlineClass;
    }

}
