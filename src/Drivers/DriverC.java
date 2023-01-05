package Drivers;
import Trans.Truck;

public class DriverC <C extends Truck> extends Driver {
    public static final String LISENSE_TYPE = "C";
    public C truck;

    public DriverC(String name, boolean lisense, int period) {
        super(name, lisense, period);
        this.lisense=lisense;
    }

    public void AbilC(Truck truck) {
        if(lisense==true) {
            System.out.println("Водитель "+name+" управляет автомобилем "+truck.model+" и будет участвавать в заезде");
        }
        else{
            System.out.println("Водитель "+name+" имеет просроченные права");
        }
    }

}
