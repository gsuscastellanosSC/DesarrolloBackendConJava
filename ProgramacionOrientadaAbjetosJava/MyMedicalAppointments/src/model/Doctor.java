package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributos
    private String speciality;


    //Constructor
    public Doctor(String name, String mail) {
        // TODO Auto-generated constructor stub
        super(name, mail);
        this.speciality = speciality;
    }

    //Metodos
    public void showName() {
        System.out.println(getName());
    }
    public void showAll() {
        System.out.println("name: "+ getName() + " speciality: " + speciality);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }
    @Override
    public String toString(){
        return super.toString() + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital Cruz roja");
        System.out.println("Departamento Cancerología");
    }


    public class AvailableAppointment{
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString(){
            return "Available Appointments \n Date:" +date+ "\nTime: " + time;
        }
    }

}
