package api;

import model.*;

import java.util.Date;

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
        System.out.println(myDoctor);
        myDoctor.showDataUser();

        User user1 = new User("Jesus", "jesuscastellanospaez@hotmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: cruz Verde");
                System.out.println("Departamento: Greatría");
            }
        };
        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedulable(Date date, String time) {

            }
        };

        //showMenu();


    }
}
