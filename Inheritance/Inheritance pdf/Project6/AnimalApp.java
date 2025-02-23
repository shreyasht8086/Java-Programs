
abstract class Animal{
   abstract public void sound();
}
class Dog extends Animal{
  public void sound()
  {
    System.out.println(" Dog make sound Bowh! bowh!");
  }
}
class cat extends Animal{
    public void sound()
  {
    System.out.println(" Cat make sound Meow Meow");
  }
}
public class AnimalApp {
     public static void main (String x[])
     {
        Animal a =new Dog();
        a.sound();
         a=new cat();
        a.sound();
     }
}
