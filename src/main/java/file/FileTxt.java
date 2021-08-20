package file;

import AirportFlight.Flight;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class FileTxt {

    public static void main(String[] args) {

        try{
            String ruta = "C:\\archivos\\flight2.txt";
            String contenido = "Contenido ejemplo 2";

            File file = new File(ruta);

            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(contenido);
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }





    public static void createFile(ArrayList list){

        FileWriter fileWriter = null;

        try{
            //CREATE TO WRITE IN FILE
            fileWriter = new FileWriter("C:\\archivos\\flight.txt");

            //CREATE A INTERMEDIATE BUFFER BEFORE TO WRITE DIRECTLY IN FILE
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            /*

            for(Flight flight : list){
                //WRITE THE DATA INTO  A FILE
                bufferedWriter.write(flight.getId() + "," + flight.getCountryOrigin() + " ," +  flight.getDestination() +" , " + flight.getAirline());
            }
*/




            //CLOSE THE INTERMEDIATE BUFFER
        } catch (IOException e) {

            e.printStackTrace();

        }finally{

            if(fileWriter != null){

                try{
                    fileWriter.close();

                }catch (IOException e){

                    e.printStackTrace();
                }
            }
        }
    }

    public static ArrayList readFile(){

        File file = new File("C:\\archivos\\flight.txt");
        ArrayList flightList = new ArrayList<>();

        Scanner scanner;

        try{

            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                Scanner limit = new Scanner(line);


                limit.useDelimiter("\\s*, \\s*");

                Flight fly = new Flight();
                fly.setId(limit.next());
                fly.setCountryOrigin(limit.next());
                fly.setDestination(limit.next());
                fly.setAirline(limit.next());
                flightList.add(fly);

            }

            //CLOSE DE OBJECT SCANNER
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return flightList;
    }

}
