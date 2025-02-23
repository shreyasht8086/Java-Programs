import java.util.*;
abstract class Shape{
    abstract void calulateArea();
    abstract void calculateTriangle();
}
class Circle extends Shape
{
    void calulateArea()
    {   Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int r=sc.nextInt();

        float area;
        area=2*3.14f*(r*r);
        System.out.println("Area of circle is:"+area);
    }
    void calculateTriangle()
    {

    }
}
class Triangle extends Shape{
    void calculateTriangle(){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the three sides of triangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.printf("Perimeter of triangle %d",a+b+c);
    }
    void calulateArea()
    {

    }
}
public class ShapeApp
{
    public static void main(String x[])
    {
       Shape s=new Circle();
       s.calulateArea();
       s=new Triangle();
       s.calculateTriangle();
    }

}