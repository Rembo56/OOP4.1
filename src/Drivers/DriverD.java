package Drivers;
import Trans.Bus;

public class DriverD <D extends Bus> extends Driver {
    public static final String LISENSE_TYPE = "D";
    public D bus;

    public DriverD(String name, boolean lisense, int period) {
        super(name, lisense, period);
        this.lisense=lisense;
    }
    public void AbilC(Bus bus) {
        if(lisense==true) {
            System.out.println("Водитель "+name+" управляет автомобилем "+bus.model+" и будет участвавать в заезде");
        }
        else{
            System.out.println("Водитель "+name+" имеет просроченные права");
        }
    }

}
