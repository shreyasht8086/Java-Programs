abstract class Animal2{
    abstract void eat();
    abstract void sleep();    
}
class Deer extends Animal2{
   void eat()
   {
    System.out.println(" Deer Grass");
         
   }
   void sleep()
   {
    System.out.println("Deer sleep Yes");
   }
}
class Tiger extends Animal2{
    void eat()
   {
    System.out.println("Tiger Meat");
         
   }
   void sleep()
   {
    System.out.println("Tiger sleep NO");
   }
}
public class AnimalApp2{
  public static void main(String x[])
  {
      Animal2 a=new Deer();
      a.eat();
      a.sleep();
      a=new Tiger();
      a.eat();
      a.sleep();
  }   
}