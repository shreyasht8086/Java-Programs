abstract class Animal{
    abstract void sound();
    
}
class Lion extends Animal{
   void sound()
   {
    System.out.println("Lion roar");
         
   }
}
class Tiger extends Animal{
    void sound()
    {
       System.out.println("Tiger roar");
    }
}
public class AnimalApp{
  public static void main(String x[])
  {
      Animal a=new Lion();
      a.sound();
      a=new Tiger();
      a.sound();
  }   
}