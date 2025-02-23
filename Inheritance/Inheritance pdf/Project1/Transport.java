import java.util.*;
public class Transport{
    public static void main(String x[])
    {
       Scanner sc=new Scanner(System.in);
       int ch,ch1;
       do{
           System.out.println("1.Truck\n2.Bus\n.3.Exit");
           ch=sc.nextInt();

           switch(ch)
           {
             case 1:
             {
                 sc.nextLine();
                System.out.println("Enter the Model");
                String model=sc.nextLine();
                System.out.println("Enter the Registration Number");
                String registrationNumber=sc.nextLine();
                System.out.println("Enter the speed");
                int speed=sc.nextInt();
                System.out.println("Enter the fuel Capacity");
                float fuelCapacity=sc.nextFloat();
                System.out.println("Enter the fuel consumption");
                float fuelConsumption=sc.nextFloat();
                System.out.println("Enter the Cargo Weight");
                int cargoweight=sc.nextInt();
                Truck t=new Truck(cargoweight,model,registrationNumber, speed,fuelCapacity,fuelConsumption);
                 do{
                    System.out.println("1.Fuel Needed\n2.Distance Covered\n3.Display\n4.Exit");
                    ch1=sc.nextInt();
                    switch (ch1)
                    {
                       case 1:
                       { 
                          t.fuelNeeded();
                       }break;
                       case 2:
                       {
                          t.distanceCoverded();
                       }break;
                       case 3:
                       {
                          t.dispaly();
                       }break;
                       case 4:
                       {
                         ch1=4;
                       }break;
                    }

                 }while(ch1>1&&ch1<4);

             }break;
             case 2:
             {
               sc.nextLine();
               System.out.println("Enter the Model");
               String model=sc.nextLine();
               System.out.println("Enter the Registration Number");
               String registrationNumber=sc.nextLine();
               System.out.println("Enter the speed");
               int speed=sc.nextInt();
               System.out.println("Enter the fuel Capacity");
               float fuelCapacity=sc.nextFloat();
               System.out.println("Enter the fuel consumption");
               float fuelConsumption=sc.nextFloat();
               System.out.println("Enter the Cargo Weight");
               int cargoweight=sc.nextInt();
               Bus b=new Bus(cargoweight, model, registrationNumber, speed, fuelCapacity, fuelConsumption);

               do{
                  System.out.println("1.Fuel Needed\n2.Distance Covered\n3.Display\n4.Exit");
                  ch1=sc.nextInt();
                  switch (ch1)
                  {
                     case 1:
                     { 
                        b.fuelNeeded();
                     }break;
                     case 2:
                     {
                        b.distanceCoverded();
                     }break;
                     case 3:
                     {
                        b.dispaly();
                     }break;
                     case 4:
                     {
                       ch1=4;
                     }break;
                  }

               }while(ch1>1&&ch1<4);
             }
             break;
             case 3:
             {
                ch=3;
             }
             break;

           }

       }while(ch>=1&&ch<3); 
    }
}
