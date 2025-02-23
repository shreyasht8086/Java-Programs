import java.util.*;
class Area{
    Area(int r)
   {
      System.out.println("Area of Circle"+((2*3.14f)*(r*r)));
   }
    Area(int l,int b)
   {
    System.out.println("Area of rectangle"+l*b);
   }
    Area(int b,float h)
   {
      System.out.println("Area of triangle"+((0.5f)*(b*h)));
   }
}

public class AreaApp{
public static void main(String x[])
 {
    Scanner sc=new Scanner(System.in);
     System.out.printf("Enter the length\n");
	 int length=sc.nextInt();
	 System.out.printf("Enter the raduis\n");
	 int r=sc.nextInt();
	 System.out.printf("Enter the breadth\n");
	 int breadth=sc.nextInt();
	 System.out.printf("Enter the base\n");
	 int base=sc.nextInt();
	 System.out.printf("Enter the heigth\n");
	 float height=sc.nextFloat();
	 
     Area a=new Area(r);
     Area a1=new Area(length,breadth);
	 Area a2=new Area(base,height);
 }
}
