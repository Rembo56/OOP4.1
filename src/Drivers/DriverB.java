package Drivers;
import Trans.PassCar;

public class DriverB <B extends PassCar> extends Driver {
    public static final String LISENSE_TYPE = "B";
    public B passCar;

    public DriverB(String name, boolean lisense, int period) {
        super(name, lisense, period);
        this.lisense=lisense;
    }

    public void AbilB(PassCar passCar) {
        if(lisense==true) {
            System.out.println("Водитель "+name+" управляет автомобилем "+passCar.model+" и будет участвавать в заезде");
        }
        else{
            System.out.println("Водитель "+name+" имеет просроченные права");
        }
    }
}
