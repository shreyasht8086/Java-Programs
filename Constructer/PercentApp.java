import java.util.*;
class Percent{
      float m[]; 
	  float per;
     Percent(float m[])
	 {
		 this.m=m;
	 }
      void calPer()
	  {   per=0;
		  for(int i=0;i<m.length;i++)
		  {
			  per=m[i]+per;
		  }
		  
		  per=per/m.length;
		  System.out.printf("Percentage:%f\n",per);
	  }	
     void checkGrades()
	 {
		if(per>=90)
		{
			System.out.printf("Grade A");
		}
		else if(per<90 && per>=80)
		   {
					System.out.printf("Grade B");
	    	}
		else if(per<80&&per>=70)
				{
					System.out.printf("Grade c");
				}
		else if(per<70&&per>=60)
				{
					System.out.printf("Grade D");
				}
        else if(per<60&&per>=50)
				{
					System.out.printf("Grade E");
				}	
        else if(per<50&&per>=40)
				{
					System.out.printf("Grade F");
				}
        else{
		   System.out.printf("Student Fail");
		}			
	 }		 
}
public class PercentApp{
 public static void main(String x[])
 {
         Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the marks");
	   float m[]=new float[5];
	   for(int i=0;i<m.length;i++)
	   {
	       m[i]=sc.nextFloat();
	   }
	   Percent p=new Percent(m);
	       p.calPer();
		   p.checkGrades();
}
}