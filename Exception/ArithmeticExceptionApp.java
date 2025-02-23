import java.util.*;
public class ArithmeticExceptionApp{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException ex){
          System.out.println("Error is :"+ex);
        }
        System.out.println(a);
        System.out.println(b);
       sc.close();
    }
    
}