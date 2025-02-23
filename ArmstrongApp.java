import java.util.*;
public class ArmstrongApp
            { static int p,sum=0,i,pow=0,rem;
                  public static void main(String x[])
                  {
                     Scanner s=new Scanner(System.in);
                     System.out.printf("Enter the number \n");
                     int no=s.nextInt();
                    
                     int po=power(no);
                     if(armstrong_number(no,po)==no)
                     {
                        System.out.printf("Number is armstrong number\n");
                     }
                     else
                     {
                        System.out.println("Number is not armstrong\n");
                     }
                  }
                  public static int power(int x)
                  {
                        
                        int temp=x;
                        while(temp!=0)
                        {
                            temp=temp/10;
                            pow++;
                        }
                        return pow;
                  }
                  public static int armstrong_number(int x,int pow)
                  { 
                    if(x>0)
                    {
                         rem=x%10;
                         i=1;
                         p=1;
                       while(i<=pow)
                       {
                           p=p*rem;
                           i++;
                        }
                       sum=sum+p;
                       x=x/10;
                      armstrong_number(x,pow);
                    }
                    return sum;
                  }
            }
            