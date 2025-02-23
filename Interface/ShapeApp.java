 //Q1. Define an interface Shape with a method calculateArea(). Implement this interface in classes Circle and Rectangle.
 interface Shape{
     void calculateArea();
     
 }
 class Circle implements Shape{
    int r;
    public void setRadius(int r)
    {
        this.r=r;
    }
    public void calculateArea()
    {
         System.out.println("Area of Circle is: "+2*3.14f*r*r);
    }
 }
 class Rectangle implements Shape{
    int l,b;
    public void setRect(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    public void calculateArea()
    {
          System.out.println("Area of Rectangle: "+l*b);
    }
 }
 public class ShapeApp{
    public static void main(String x[])
    {
         Circle c=new Circle();
         c.setRadius(5);
         c.calculateArea();
         Rectangle r=new Rectangle();
         r.setRect(5,10);
         r.calculateArea();
    }
 }

