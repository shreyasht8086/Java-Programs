import java.util.*;
class Sort{
   void sort(int arr[])
   {   int temp;
       for(int i=0;i<arr.length;i++)
       {
         for(int j=i+1;j<arr.length;j++)
         {
             if(arr[i]>arr[j])
             {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
             }
         }
       }
       System.out.printf("Integer Array after sorting:\n");
       for(int i=0;i<arr.length;i++)
       {
          System.out.printf("%d\t",arr[i]);
       }
   }
   void sort(char arr[])
   {   char temp;
       for(int i=0;i<arr.length;i++)
       {
         for(int j=i+1;j<arr.length;j++)
         {
             if(arr[i]>arr[j])
             {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
             }
         }
       }
       System.out.printf("\nCharcter Array after sorting:\n");
       for(int i=0;i<arr.length;i++)
       {
          System.out.printf("%c\t",arr[i]);
       }
   }
}
public class ArraySort{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the size of Integer array\n");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.printf("Enter elements in array\n");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.printf("Enter the size of character array\n");
        int ch_size=sc.nextInt();
        char ch_arr[]=new char[ch_size];
        System.out.printf("Enter the character elements in array\n");
        for(int j=0;j<ch_arr.length;j++)
        {
            ch_arr[j]=sc.next().charAt(0);
        }
        Sort s=new Sort();
        s.sort(arr);
        s.sort(ch_arr);
        sc.close();
    }

}
