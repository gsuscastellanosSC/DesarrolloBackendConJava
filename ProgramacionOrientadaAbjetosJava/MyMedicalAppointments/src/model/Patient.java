package model;

public class Patient extends User{
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email){
        super(name, email);

    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historia clinica...");
    }

    public String getBirthday() {
        return birthday;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}


