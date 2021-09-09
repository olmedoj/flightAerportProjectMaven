package OutputandInputs;

import file.SendEmail;

import javax.mail.MessagingException;
import java.util.Scanner;

public class Handler {
    public void Handler(){

    }

    //Catch Data form keyboard
    public Scanner Read(){
        Scanner consola = new Scanner(System.in);
        return consola;
    }

    //Pause the Views
    public void pausar(){
       //Scanner stop = new Scanner(System.in);
        System.out.println("Press enter to continue...");
        Read().nextLine();
    }

    //Visual
    public void printlines(){
        System.out.println("==============================");
    }

    //Main Menu of System
    public void Menu() throws MessagingException {
        //int option = op;
        AirportInputs airportInputs = new AirportInputs();
        AirlinesInput airline = new AirlinesInput();
        FlightInput fly = new FlightInput();
        SendEmail email = new SendEmail();
        DepartureInput departure = new DepartureInput();
        WeatherInput weather = new WeatherInput();

        int option;

        do{
            System.out.println("=====MENÚ AIRPORT=====");
            System.out.println("\n What do you do? ");

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
            System.out.println("11. View Weather condiction");
            System.out.println("0. Salir");
            System.out.print("\n Choose an Option: ");
            option = Read().nextInt();

        switch(option){

            case 1: airportInputs.insertDataAirport();
                    System.out.println("The data was success");
                    pausar();
                    break;
            case 2: airline.insertAirline();
                    System.out.println("The data was success");
                    pausar();
                    break;
            case 3: fly.insertDataFlight();
                    System.out.println("The data was success");
                    pausar();
                    break;
            case 4:  departure.insertDepartures();
                    System.out.println("The data was success");
                    pausar();
                    break;
            case 5: System.out.println(airportInputs.getDatAirport());
                    pausar();
                    break;
            case 6: System.out.println(airline.showDataAirline());
                    pausar();
                    break;
            case 7: System.out.println(fly.ShowDataFlight());
                    pausar();
                    break;
            case 9: System.out.println(departure.showDataDeparture());
                    pausar();
                    break;
            case 10: email.sendEmail();
                    pausar();
                    break;
            case 11: System.out.println(weather.WeatherInput());
                    //weather.addWeather();
                    pausar();
                    break;
            default: System.out.println("Opción de menú no valida");
                    pausar();
                    break;

        }
        }while(option != 0);

    }
}
