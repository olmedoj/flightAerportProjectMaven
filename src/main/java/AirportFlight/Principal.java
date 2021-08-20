package AirportFlight;

import OutputandInputs.AirlinesInput;
import OutputandInputs.AirportInputs;
import OutputandInputs.DepartureInput;
import OutputandInputs.FlightInput;
import file.SendEmail;

import javax.mail.MessagingException;

import java.util.Scanner;

public class Principal {


    public static void main(String[] args) throws MessagingException {

        Scanner consola = new Scanner(System.in);

        AirportInputs airportInputs = new AirportInputs();

        AirlinesInput airline = new AirlinesInput();

        FlightInput fly = new FlightInput();

        SendEmail email = new SendEmail();

        DepartureInput departure = new DepartureInput();

        int op;


        do{
            System.out.println("=====MENÚ AIRPORT=====");
            System.out.println("\n What do you do?");

            System.out.println("1. Insert Aerport");
            System.out.println("2. Insert Airline");
            System.out.println("3. Insert Flight");
            System.out.println("4. Insert departures and Arrival Info");
            System.out.println("5. Get Aerport");
            System.out.println("6. Get Airline");
            System.out.println("7. Get Flight");
            System.out.println("8. Get FlightSchedule");
            System.out.println("9. Get Departure an Arrival Info");
            System.out.println("10. Send email whit info");
            System.out.println("0. Salir");
            System.out.println("\n Choose an Option");
            op = consola.nextInt();

            switch(op){

                case 1: airportInputs.insertDataAirport();
                        System.out.println("The data was success");
                        break;
                case 2: airline.insertAirline();
                        System.out.println("The data was success");
                        break;
                case 3: fly.insertDataFlight();
                        System.out.println("The data was success");
                        break;
                case 4:  departure.insertDepartures();
                         System.out.println("The data was success");
                         break;
                case 5: System.out.println(airportInputs.getDatAirport());
                        break;
                case 6: System.out.println(airline.showDataAirline());
                        break;
                case 7: System.out.println(fly.ShowDataFlight());
                        break;
                case 9: System.out.println(departure.showDataDeparture());
                        break;
                case 10: email.sendEmail();
                        break;
                default: System.out.println("Opción de menú no valida");
                         break;
            }

        }while(op != 0);


        }
}
