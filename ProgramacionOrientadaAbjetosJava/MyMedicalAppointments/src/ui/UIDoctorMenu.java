package ui;

import java.util.Scanner;

public class UIDoctorMenu {
    public  static void showDoctorMenu(){
        int responde = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome" + Menu.doctorLogged.getName());
            System.out.println("1. Add Available Appointmen");
            System.out.println("2. My Scheduled apponintments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            responde = Integer.valueOf(sc.nextLine());

            switch (responde){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    Menu.showMenu();
                    break;
            }

        }while (responde != 0);
    }

    private static void showAddAvailableAppointmentsMenu(){
        int responde = 0;
        do {
            System.out.println();
            System.out.println("::Add Available Appointment");
            System.out.println(":: Select a Month");

            for (int i = 0; i < 3; i++){
                int j = i +1;
                System.out.println(j + ". " + Menu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            responde = Integer.valueOf(sc.nextLine());

            if(responde > 0 && responde < 4){
                //1, 2 ,3;
                int monthSElected = responde;
                System.out.println(monthSElected + ". " + Menu.MONTHS[monthSElected]);

                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("Your date is:" + date + "\n1. Correct \n2. Change Date");

                
            }else if(responde == 0){
                showDoctorMenu();
            }

        }while (responde != 0);
    }
}
