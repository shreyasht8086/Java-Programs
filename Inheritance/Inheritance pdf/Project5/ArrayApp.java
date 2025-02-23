
import java.util.*;
class ArrayOperation 
{   
     void performOperation(int a[])
     {

     }
}
class Sort extends ArrayOperation{
    void performOperation(int a[])
    {
          for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                
            }
          }
          for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
          }
    } 

}
class Deletion{
    Scanner sc=new Scanner(System.in);
    void performOperation(int a[])
    {
          System.out.printf("Enter Eelment you wnat to delete");
          int no=sc.nextInt();
          for (int i = 0; i < a.length; i++) {
            
            if(no==a[i])
            {
                for(int j=i;j<a.length-1;j++)
                {
                    a[j]=a[j+1];
                }
                break;
            }

          }
          for (int i = 0; i < a.length-1; i++) {
            System.out.print(" "+a[i]);
          }

    } 
}
class Reverse{
    void performOperation(int a[])
    {
       
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                
            }
          }
          for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
          }

    } 
}
class Insertion{

}
public class ArrayApp{
    public static void main (String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in array");
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
          int ch;
        do {
            System.out.println("1.Sort\n2.Insert\n3.Reverese\4.Delete\n5.Exit");
            System.out.println("Enter your choice");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                {
                    Sort s=new Sort();
                    s.performOperation(a);

                }
                 break;
                 case 2:
                {

                }
                 break;
                 case 3:
                {
                    Reverse r=new Reverse();
                    r.performOperation(a);
                }
                 break;
                 case 4:
                {
                    Deletion d=new Deletion();
                    d.performOperation(a);
                }
                 break;
            
                default:
                    break;
            }
        } while (ch>1&&ch<5);
    }
}