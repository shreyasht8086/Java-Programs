import java.util.*;
class Rectangle{
    int l,b;
    Rectangle()
    {
	  
    }
    Rectangle(int l ,int b)
    {
          this.l=l;
		  this.b=b;
    }
    Rectangle(int l)
    { 
	  this.l=l;
	  this.b=l;
       
    }
    void calculateArea()
    {
       System.out.printf("Area of Rectangle: %d\n",l*b);
    }
}
public class RectangleApp{
    public static void main(String x[])
    {
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the length of rectangle");
	   int l=sc.nextInt();
	   System.out.println("Enter the breadth of rectangle");
	   int b=sc.nextInt();
	   Rectangle r=new Rectangle();
	   Rectangle r1=new Rectangle(l,b);
	   Rectangle r2=new Rectangle(l);
	   
	   r.calculateArea();
	    r1.calculateArea();
		 r2.calculateArea();
	   
    }
}