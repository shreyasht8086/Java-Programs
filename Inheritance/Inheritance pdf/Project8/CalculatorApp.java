
import java.util.Scanner;

abstract class Value{
    int a,b;
    void setvalue(int a,int b)
   {
      this.a=a;
      this.b=b;
   }
   abstract void performCalculation();
}
class Add extends Value{
     void performCalculation()
    {
         System.out.println("Addition of Number is : "+(a+b));
    }
}
class Mul extends Value{
    void performCalculation()
   {
        System.out.println("Multiplication of Number is : "+a*b);
   }
}
class Div extends Value{
    void performCalculation()
   {
        System.out.println(" Division of Number is : "+a/b);
   }
}
class Sub extends Value{
    void performCalculation()
   {
        System.out.println("Subtraction of Number is : "+(a-b));
   }
}
class Calulator{
    void performOperation(Value v)
    {
        v.performCalculation();
    }

}
public class CalculatorApp{
    public static void main(String x[])
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the two values");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int ch;
       do {
        System.out.println("1.Addition\n2.Substraction\n3.Divison\n4.Multiplication\n5.Exit");
        System.out.println("Enter your choice");
         ch=sc.nextInt();
        switch (ch) {
            case 1:
            {
                Value v=new Add();
                v.setvalue(a, b);
                Calulator cal=new Calulator();
                cal.performOperation(v);
            }   
            break;    
            case 2:
            {
                Value v=new Sub();
                v.setvalue(a, b);
                Calulator cal=new Calulator();
                cal.performOperation(v);
            } 
            break;  
            case 3:
            {
                Value v=new Div();
                v.setvalue(a, b);
                Calulator cal=new Calulator();
                cal.performOperation(v);
            }   
            break;    
            case 4:
            {
                Value v=new Mul();
                v.setvalue(a, b);
                Calulator cal=new Calulator();
                cal.performOperation(v);
            } 
            break; 

           
           }
       } while (ch>=1&&ch<5);
       
    }
}