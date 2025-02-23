import java.util.*;
class Number{
     int no;
    void setNumber(int no)
    {
     this.no=no;
    }
}
class Reverse extends Number{
    int getReverse()
    {  int rem,rev=0;
        while(no>0)
        {
           rem=no%10;
           rev=rev*10+rem;
           no=no/10;
        }
      return rev;
    }
}
class CountDigit extends Number{
    int getDigitCount()
    {  int count=0;
        while(no>0)
        {
           no=no/10;
           count++;
        }
        return count;
    }
}
class SumOfDigit extends Number{
  int getDigitSum()
 {   int sum=0,rem;
     while(no>0)
     {
        rem=no%10;
        sum=sum+rem;
        no/=10;
     }
      
    return sum;
 }
}
class IsPrime extends Number{
  boolean isPrime()
  { int i=2;
    boolean flag=false;
    while(no>i)
    {
        if(no%i==0)
        {
            flag=true;
            break;
        }
        i++;
    }

    return flag;
  }
 }
public class NumberApp{
    public static void main (String x[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int no=sc.nextInt();
       Reverse r=new Reverse();
       r.setNumber(no);
       int rev=r.getReverse();
       System.out.printf("Reverse of number is %d\n",rev);

       CountDigit cd= new CountDigit();
       cd.setNumber(no);
       int count=cd.getDigitCount();
       System.out.printf("Count of digit %d\n",count);

       SumOfDigit s=new SumOfDigit();
       s.setNumber(no);
       int sum=s.getDigitSum();
       System.out.printf("Sump of digit %d\n",sum);

       IsPrime p=new IsPrime();
       p.setNumber(no);
       boolean flag= p.isPrime();
       if(!flag)
       {
       System.out.printf("Is prime\n");
       }
       else
       {
        System.out.printf("Not prime\n");
       }

    }
}