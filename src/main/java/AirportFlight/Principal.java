package AirportFlight;

import OutputandInputs.Handler;

import javax.mail.MessagingException;

public class Principal {

    public static void main(String[] args) throws MessagingException {
        //Access to the main menu
        Handler handler = new Handler();
        handler.Menu();

        }
}
