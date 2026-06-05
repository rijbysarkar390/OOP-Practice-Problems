class Car{
    private String name;
    private String brand;
    private String sn;
    private double fuelLevel;
    private boolean isRunning;
    Car(String name, String brand, String sn, double fuelLevel, boolean isRunning){
        this.name=name;
        this.brand=brand;
        this.sn=sn;
        this.fuelLevel=fuelLevel;
        this.isRunning=isRunning;
    }
    public String owner(){
        return name;
    }
    public String brandName(){
        return brand;
    }
    public String serialNumber(){
        return sn;
    }
    public void refuel(double amount){
        fuelLevel+=amount;
    }
    public void start(){
        if(fuelLevel>0){
            isRunning=true;
            System.out.println("Car is Running");
        }
        else System.out.println("please enter some amount of fuel inside the car");
    }
    public void stop(){
        isRunning = false;
        System.out.println("Car stopped");
    }
    public void remainingFuel(double amount){
        fuelLevel-=amount;
        if(fuelLevel<0) fuelLevel=0;
    }
}
public class CarDemo {
    public static void main(String[] args){
        Car privateCar = new Car("Rijby Sarkar","BMW","1234-9850D",5,false);
        System.out.println(privateCar.owner());
        System.out.println(privateCar.brandName());
        System.out.println(privateCar.serialNumber());
        privateCar.refuel(3);
        privateCar.start();
        privateCar.stop();
        privateCar.remainingFuel(9);
        privateCar.start();
    }
}
