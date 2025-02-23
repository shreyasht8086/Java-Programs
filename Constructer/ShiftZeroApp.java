// Q2. WAP to Given integer array move all 0’s at the end while maintaining the relative order the non zero elements.
// Note: perform operation on same do not use duplicate or another array.
// Example:
// Input: nums=[0,1,0,3,12];
// Output: 1 ,3,12,0 0

// Your Task
// You have to create class name as ShiftZero with parameterized constructor

// ShiftZero(int a[]): this constructor can accept number as parameter 
// int [] getArrayAfterShifting(): you have to perform operation on same and return it array after shifting zero.
import java.util.*;
class ShiftZero{
    int a[];
    ShiftZero(int a[])
    {
         this.a=a;
    }
    int[] getArrayAfterShifting()
    { int index=0,temp=a[0];
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
      for(int i=0;i<a.length;i++)
      {
        
            if(a[i]!=0)
             {
                a[index]=a[i];
                index++;
            }
       
      }
      for(int i=index;i<a.length;i++)
      {
         a[i]=0;
      }
      return a;
    }
    
}
public class ShiftZeroApp{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Size of array\n");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++)
        {
           a[i]=sc.nextInt();
        }
        ShiftZero s=new ShiftZero(a);
        int shift[]=s.getArrayAfterShifting();
        System.out.printf("After shifting\n");
        for(int sh:shift)
        {
            System.out.println(sh);
        }

    }
}