import java.util.Scanner;

/**
 * Vehicle
 */
public class Vehicle {

    private String model;
    private String registrationNumber;
    private  int speed;
    private  float fuelCapacity;
    private  float fuelConsumption;
     
    Scanner sc=new Scanner(System.in);

    public  Vehicle( String model,String registrationNumber,int speed, float fuelCapacity,float fuelConsumption)
    {  
        this.fuelCapacity=fuelCapacity;
        this.model=model;
        this.fuelConsumption=fuelConsumption;
        this.registrationNumber=registrationNumber;
        this.speed=speed;

    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public float getFuelCapacity() {
        return fuelCapacity;
    }
    public void setFuelCapacity(float fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    public float getFuelConsumption() {
        return fuelConsumption;
    }
    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void fuelNeeded()
    {
        System.out.println("Enter the distance");
        int distance=sc.nextInt();
        float fuelNeeded=distance/getFuelConsumption();
        System.out.println("Fuel needed"+fuelNeeded);
    }
    public void distanceCoverded()
    {
        System.out.println("Enter the time required in hours");
        int time=sc.nextInt();
        float distance=getSpeed()*time;
        System.out.println("Distance covereded:"+distance);

    }
    public void dispaly()
    {
         System.out.println("Model\tRegistration Number\tSpeed\tCargo weight\t Fuel capacity\tFuel consumption");
         System.out.println(getModel()+"\t\t"+getRegistrationNumber()+"\t\t"+getSpeed()+"\t\t"+getCargoweight()+"\t\t"+getFuelCapacity()+"\t\t"+getFuelConsumption());
    }
    
}