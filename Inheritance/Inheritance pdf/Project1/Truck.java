import java.util.*;
public class Truck extends Vehicle 
{
    private int cargoweight;
    Scanner sc=new Scanner(System.in);
    public Truck(int cargoweight,String model,String registrationNumber,int speed, float fuelCapacity,float fuelConsumption)
    {    super (model,registrationNumber,speed, fuelCapacity, fuelConsumption);
        this.cargoweight=cargoweight;
    }
    public int getCargoweight() {
        return cargoweight;
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
