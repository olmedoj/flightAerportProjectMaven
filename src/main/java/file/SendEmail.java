package file;

import AirportFlight.Flight;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.IOException;
import java.util.Properties;

public class SendEmail {


    public void sendEmail() throws MessagingException {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.user", "aeroportgroup06@gmail.com");
        props.setProperty("mail.smtp.auth", "true");
        Session session = Session.getDefaultInstance(props, null);
        session.setDebug(true);
        BodyPart bodyPart = new MimeBodyPart();
        bodyPart.setText("Hi! \nThese are the flights you requested. Enjoy the trip.");
        BodyPart attached = new MimeBodyPart();
        attached.setDataHandler(new DataHandler(new FileDataSource("./src/main/Data2.xlsx")));
        attached.setFileName("./src/main/Data2.xlsx");
        MimeMultipart multipart = new MimeMultipart();
        multipart.addBodyPart(bodyPart);
        multipart.addBodyPart(attached);
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress("aeroportgroup06@gmail.com"));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress("arevalodaniel999@gmail.com"));
        message.setSubject("Flight");
        message.setContent(multipart);
        Transport t = session.getTransport("smtp");
        t.connect("aeroportgroup06@gmail.com", "123qweQWE");
        t.sendMessage(message, message.getAllRecipients());
        t.close();
        System.out.print("Send message");
    }

    public static void main(String[] args) throws IOException, MessagingException {
        SendEmail flight = new SendEmail();
        flight.sendEmail();
    }



}
