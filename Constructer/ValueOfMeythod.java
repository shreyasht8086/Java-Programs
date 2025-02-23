import java.util.*;

public class ValueOfMeythod{
    public static void main(String x[])
    {
       Scanner sc=new Scanner(System.in);
	   
	  
	  char ch[]={'a','b','c','d'};
	  
	
	   for(int i=0;i<ch.length;i++)
	  {
	    String n=String.valueOf(ch[i]);
			  System.out.print(" "+n);
	  }
	  
	  
	  

	 
	  
	  for(int i=0;i<ch.length;i++)
	  {
	  System.out.print(" "+ch[i]);
	  }
	  
	  //________________________________________
	  
	  String s="";
	   
	  for(int i=0;i<ch.length;i++)
	  {
	 s=s+ch[i];
	  }
	  
	   System.out.print("  "+s);
	  
	   
    }
}