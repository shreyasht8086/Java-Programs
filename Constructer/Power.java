import java.util.*;
class Power{
    int base,index;
   
    Power(int i ,int b)
    {
          this.index=i;
		  this.base=b;
    }
   
    void getPower()
    {
       int p=1;
	   for(int i=1;i<=index;i++)
	   {
		   p=p*base;
	   }
	   System.out.printf("Power is :%d",p);
    }
}
public class PowerApp{
    public static void main(String x[])
    {
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the Index");
	   int i=sc.nextInt();
	   System.out.println("Enter the base");
	   int b=sc.nextInt();
	   power p=new Power(i,b);
	  
	   p.getPower();
	  
	   
    }
}