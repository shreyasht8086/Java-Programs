// Q. WAP Create class name as Bill with method int getBill(int qty,int rate)
// this method can calculate the bill without any discount or without GST
// and you have to two classes name as RegularCustomer and BulkPurchseCustomer
// you have to inherit Bill class in RegularCustomer and override int getBill(int qty,int rate) 
// in RegularCustomer and give 20% discount on Bill and you have to inherit 
// the Bill class in BulkPucharseCustomer and override getBill(int qty,int rate) 
// method and calculate bill and give 10% discount on it.

import java.util.*;
class Bill{
   int getBill(int qty,int rate)
   {
     int  bill=qty*rate;
     return bill;
   }
}
class RegularCustomer extends Bill{
    int getBill(int qty,int rate)
    {
      int  bill=qty*rate;
      int discount=bill*20/100;
        bill=bill-discount;
       return bill;
    }
}
class BulkPurchaseCustomer extends Bill{
    int  getBill(int qty,int rate)
    {
        int  bill=qty*rate;
        int discount=bill*10/100;
          bill=bill-discount;
         return bill;
    }
}
public class BillApp{
    public static void  main(String x[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the quantity");
       int qty=sc.nextInt();
       System.out.println("Enter the rate");
       int rate=sc.nextInt();
   
       Bill b=new Bill();
       int bill=b.getBill(qty, rate);
       System.out.println("Bill without discount :"+bill);

       RegularCustomer rc=new RegularCustomer();
       bill=rc.getBill(qty, rate);
       System.out.println("Bill for regular customer:"+bill);

       BulkPurchaseCustomer bc=new BulkPurchaseCustomer();
       bill=bc.getBill(qty, rate);
       System.out.println("Bill for Bulk Purchase customer:"+bill);

    }
}
