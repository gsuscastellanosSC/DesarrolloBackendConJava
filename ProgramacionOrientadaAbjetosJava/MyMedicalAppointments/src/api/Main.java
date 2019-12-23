package api;

import java.util.Date;

import static ui.Menu.*;
public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Jesús", "Cardiologo");
        //myDoctor.showName();
        //myDoctor.showAll();
        Doctor myDoctor2 = new Doctor("Juan", "Cardiologo");
        //myDoctor.showName();
        //myDoctor2.showAll();

        Patient patient = new Patient("Alejanra", "ale@hotmail.com");

        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for( Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        System.out.println(patient);

        //showMenu();


    }
}
