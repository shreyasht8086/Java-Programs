//Q3. Write a java program to create class name as Frequency using Constructor overloading name as :
//
//	void Frequency(int [ ])
//	{
//		 count even and odd number in array.
//	}
//	
//	
//	void Frequency(char [ ])
//	{
//		 count alphabet , digit and special symbol charcter in string.
//	}
import java.util.*;
class Frequency{
	Frequency(int a[]){
		int counte=0,counto=0;
		for(int i=0;i<a.length;i++)
		{
		   if(a[i]%2==0)
		   {
			   counte++;
		   }
		   else{
		      counto++;
		   }
		   
		}
		System.out.printf("Odd count:%d\nEven count :%d\n",counto,counte);
	}
	Frequency(char ch[]){
		int counta=0,countd=0,counts=0;
	 for(int i=0;i<ch.length;i++)
	 {
		 if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z')
		 {
			counta++; 
		 
		 }
		 else if(ch[i]>='0'&&ch[i]<='9')
		 {
			 countd++;
		 }
		 else{
			 counts++;
		 }
		 
	 }
	 System.out.printf("count alphabet%d \ndigit %d\n special symbol %d\n",counta,countd,counts);
	}

}
public class FrequencyApp{
	public static void main(String x[])
	{
	  Scanner sc=new Scanner(System.in);
      System.out.println("Enter the integer in array");
      int a[]=new int[5];
      for(int i=0;i<a.length;i++)
	  {
		  a[i]=sc.nextInt();
	  }	
	  System.out.println("Enter the charcters in array");
	  char ch[]=new char[5];
	   for(int i=0;i<a.length;i++)
	  {
		  ch[i]=sc.next().charAt(0);
	  }	
	  Frequency f=new Frequency(a);
	  Frequency f1=new Frequency(ch);
       	  
	}
}