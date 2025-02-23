abstract class Area {
    abstract void showArea();
 }
 class Circle extends Area{
      int r;
      void setRaduis(int r)
      {
        this.r=r;
      }
     void showArea()
     {
         System.out.println("Area of circle:"+2*3.14f*r*r);
     }
 } 
 class Rectangle extends Area{
     int len,wid;
     void setLengthWidth(int len,int wid)
     {
         this.len=len;
         this.wid=wid;
     }
    void showArea()
    {
     System.out.println("Area of Rectangle:"+len*wid);
    }
 } 
 public class AreaApp {
    public static void main(String x[])
    {
          Circle cir=new Circle();
           cir.setRaduis(5);
           cir.showArea();
           Rectangle rec=new Rectangle();
           rec.setLengthWidth(10,10 );
           rec.showArea();
    }  
 
 }
 