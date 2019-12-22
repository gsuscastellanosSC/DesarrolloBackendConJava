package api;

import static ui.Menu.*;
public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Jesús", "Cardiologo");
        myDoctor.showName();
        myDoctor.showAll();
        Doctor myDoctor2 = new Doctor("Juan", "Cardiologo");
        myDoctor.showName();
        myDoctor2.showAll();

        myDoctor=myDoctor2;

        myDoctor.showAll();
        myDoctor2.showAll();

        myDoctor2.setName("Otro Nombre");

        myDoctor.showAll();
        myDoctor2.showAll();
        showMenu();
    }
}
