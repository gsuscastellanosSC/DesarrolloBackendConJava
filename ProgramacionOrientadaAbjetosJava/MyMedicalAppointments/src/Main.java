import static ui.Menu.*;
public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Jesús", "Cardiologo");
        myDoctor.showName();
        myDoctor.showAll();
        Doctor myDoctor2 = new Doctor("Jesús", "Cardiologo");
        myDoctor2.showName();
        myDoctor2.showAll();

        showMenu();
    }
}
