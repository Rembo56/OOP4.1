package Drivers;
public abstract class Driver{

    public String name;
    public boolean lisense;
    public int period;

    public String getName() {
        return name;
    }

    public boolean isLisense() {
        return lisense;
    }

    public int getPeriod() {
        return period;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLisense(boolean lisense) {
        this.lisense = lisense;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Driver(String name, boolean lisense, int period) {
        this.name=name;
        this.lisense=lisense;
        this.period=period;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", lisense=" + lisense +
                ", period=" + period +
                '}';
    }

    public void startMoving(){
        System.out.println("Машина начала движение");
        }

    public void stopMoving(){
        System.out.println("Машина остановилась");
    }

    public void addOil(){
        System.out.println("Необходимо заправить авто");
    }
}
