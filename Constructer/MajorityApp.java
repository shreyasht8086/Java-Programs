import java.util.*;
class Majority{
    int a[];
   
    Majority(int a[])
    {
		  this.a=a;
    }
   
    void getMajority()
    {
      int flag=0,count;
	   for(int i=0;i<a.length;i++)
	   {
		   count=0 ;
		 for(int j=0;j<a.length;j++)
		 {
		      if(a[i]==a[j])
			  {
				  count++;
			  }
  
		 }
            if(count>a.length/2)
  			{
				 flag=1;
				 break;
			}				
	   }
	   if(flag==1)
	   {
	   System.out.printf("Yes");
	   }
       else
	   {
		   System.out.printf("No");
	   }
    }
}
public class MajorityApp{
    public static void main(String x[])
    {
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the Elements in array");
	   int a[]=new int[5];
	   for(int i=0;i<a.length;i++)
	   {
	       a[i]=sc.nextInt();
	   }
	   Majority m=new Majority(a);
	   m.getMajority();
	  
	   
	  
	   
    }
}