import java.util.Scanner;

class Array
{  int a[];
    void setArray(int a[])
    {
        this.a=a;
    }
}
class SortArray extends Array{
    int[] getSortedeArray()
    {
        int temp=a[0];
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
        return a;
    }
}
class RevArray extends Array{
    int[] getReverseArray()
    {
            int temp=a[0];
                for(int i=0;i<a.length;i++)
                {
                    for(int j=i+1;j<a.length;j++)
                    {
                            temp=a[i];
                            a[i]=a[j];
                            a[j]=temp;
                    }
                }
                return a;
    }

}
class Sum extends Array{
 int getSumOfArray()
 {  int sum=0;
    for(int i=0;i<a.length;i++)
    {
        sum=sum+a[i];
    }
    return sum;
 }
}
class SecondHighest extends Array{
    int getSecondHigest()
    {   int max1=a[0],max2=a[0];
        for(int i=0;i<a.length;i++)
        {
         
                 if(max1<a[i])
                 {
                    max1=a[i];
                 }
          
        }
        for(int i=0;i<a.length;i++)
        {
            if(max2<a[i]&&max1!=a[i])
            {
                max2=a[i];
            }
        }
        return max2;
    }
}
public class ArrayApp{
    public static void main(String x[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.printf("size of Array\n");
         int size=sc.nextInt();
         System.out.printf("Enter the elements in array\n");
         int a[]=new int[size];
         for(int i=0;i<a.length;i++)
         {
            a[i]=sc.nextInt();
         }
         int ch;
         do{
            System.out.println("\n1.Sort Array\n2.RevArray\n3.Sum Of Array\n4.Second Highest\n5.Exit\n");
            System.out.println("Enter to your choice");
            ch=sc.nextInt();
             switch(ch){
                case 1:
                {
                    SortArray sa=new SortArray();
                     sa.setArray(a);
                     int sort[];
                     sort=sa.getSortedeArray();
                     System.out.println("Sorted Array");
                     for(int i=0;i<sort.length;i++)
                     {
                        System.out.printf("%d\t",sort[i]);
                     }
                }
                break;
                case 2:
                {
                    RevArray r=new RevArray();
                    r.setArray(a);
                    int rev[];
                    rev=r.getReverseArray();
                    for(int i=0;i<rev.length;i++)
                    {
                       System.out.printf("%d\t",rev[i]);
                    }

                }
                break;
                case 3:
                {
                    Sum s=new Sum();
                    s.setArray(a);
                    int sum;
                    sum=s.getSumOfArray();
                    System.out.println("Sum of Array "+sum);

                }break;
                case 4:
                {
                    SecondHighest sh=new SecondHighest();
                    sh.setArray(a);
                    int second=sh.getSecondHigest();
                    System.out.println("Second Highest "+second);
                }
                break;
                case 5:
                {
                  ch=5;
                }break;
                 default:
                 {
                    System.out.println("Wrong input");
                 }
                 break;
             }

         }while(ch>0&&ch<5);
        

         sc.close();
    }
} 