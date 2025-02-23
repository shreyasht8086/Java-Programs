// Q3.You have given a large array represented as an integer array digits where each digit[i] is the ith digit of the integer. the digits are ordered from most significant to least significant in left to right order . the large integer does not contain leaning 0’s increment the large integer by one and return the resulting array of digits.
// Input: digits=[1,2,3]
// Output: [1,2,4]
// Explanation: the array represents the integer 123 Incrementing by one gives 123+1=124 thus should the result is 124

// You’re Task 
// ____________________________________________________________
// You have to create class name as IncrementingByOne with following constructor and method 
// IncrementingByOne (int a[]): this constructor can accept integer array 
// int [] getArrayAfterIncrement(): this method can increment array by 1 and return it.
import java.util.*;
class IncrementingByOne{
    int a[];
    IncrementingByOne(int a[])
    {
      this.a=a;
    }
    int [] getArrayAfterIncrement()
    {
        a[a.length-1]=a[a.length-1]+1;
        return a;
    }

}
 public class IncrementingByOneApp{
    public static void main(String x[])
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of array");
            int size=sc.nextInt();
            int a[]=new int[size];
            System.out.println("Enter elements in array");
            for(int i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();
            }
            IncrementingByOne inc=new IncrementingByOne(a);
            int b[];
            b=inc.getArrayAfterIncrement();
            System.out.println("After incrementing by one");
            for(int i=0;i<b.length;i++)
            {
                System.out.print(b[i]+" ");
            }
    }

 }