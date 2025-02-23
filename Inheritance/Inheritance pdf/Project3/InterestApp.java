import java.util.Scanner;

class Interest{
    int pamt,dur;
    double rate;
     void setPRD(int pamt, double rate, int dur) {
        this.pamt = pamt;
        this.rate = rate;
        this.dur = dur;
    }

    

}
class CalculateInterest extends Interest
{
   void CallInterest()
    {
      double si=pamt*dur*rate/100;
      System.out.println("Simple Interest:"+si); 
    }
   
}
public class InterestApp {
    public static void main(String x[])
    {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the amount");
    int pamt=sc.nextInt();
    System.out.println("Enter the rate");
    double rate=sc.nextDouble();
    System.out.println("Enter the duration");
    int dur=sc.nextInt();
    
    CalculateInterest ci=new CalculateInterest();
    ci.setPRD(pamt, rate, dur);
    ci.CallInterest();

    }
}
