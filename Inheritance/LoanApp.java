// Q. WAP to Create parent class name as Bank with one method name as 
// public float getMonthlyEmiUsingSimpleInterest(int loanAmont,int duration)
// : this method can calculate the monthly emi using simple interest rate 9%
// Note: you have to create two more child class name as Cooperative and Nationalize and
//  you have to inherit Bank class in Cooperative and Nationalize class and override
//  getMonthlyEmiUsingSimpleInterest(int loanAmont,int duration) in both classes and Cooperative class calculate monthly
//    EMI using interest rate 10% and Nationalize class calculate monthly EMI using 7% interest.

import java.util.*;
class Bank{
    
    float getMonthlyEmiUsingSimpleInterest(int loanAmont, int duration)
    {
     
        float interest=loanAmont*0.09f;
        float loan=loanAmont+ interest;

        float emi=loan/(duration*12);
        return emi;
    } 
}
class CooperativeBank extends Bank{
    
    float getMonthlyEmiUsingSimpleInterest(int loanAmont, int duration)
    {
        float interest=loanAmont*0.10f;
        float loan=loanAmont+ interest;
        
        float emi=loan/(duration*12);
        return emi;
    }
}
class NationalizeBank extends Bank{
    
    float getMonthlyEmiUsingSimpleInterest(int loanAmont, int duration)
    {
        float interest=loanAmont*0.07f;
        float loan=loanAmont+ interest;

        float emi=loan/(duration*12);
        return emi;
    }

}
public class LoanApp{
    public static void main(String x[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Loan amount:");
      int loanAmont=sc.nextInt();
      System.out.println("Enter the duration in years");
      int duration=sc.nextInt();
       
      Bank b=new Bank();
      float emi=b.getMonthlyEmiUsingSimpleInterest(loanAmont, duration);
      System.out.println("Emi of Bank:"+emi);

      CooperativeBank cb=new CooperativeBank();
       emi=cb.getMonthlyEmiUsingSimpleInterest(loanAmont, duration);
      System.out.printf("\nEmi Cooperative Bank:%f\n",emi);

      NationalizeBank nb=new NationalizeBank();
      emi=nb.getMonthlyEmiUsingSimpleInterest(loanAmont, duration);
      System.out.printf("\nEmi of Nationalize Bank:%f\n",emi);



    }
}
