// Q2. Write a java program to create class name as Reverse using Constructor overloading name as :

// 	void Reverse(int [ ])
// 	{
// 		  perform integer reverse array logic.
// 	}
	
// 	void Reverse(char [ ])
// 	{
// 		 perform string reverse logic.
// 	}
import java.util.*;
class Reverse{
   Reverse(int a[])
   {
      for(int i=0;i<a.length;i++)
      {
        System.out.print(a[i]);
      }
   }
   Reverse(char ch[])
   {
    for(int i=ch.length-1;i>=0;i--)
    {
      System.out.printf("%c",ch[i]);
    }
   }
}
public class ReverseApp{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the integer\n");
         int num=sc.nextInt();
		 
		 int count=0,temp;
		 temp=num;
		 while(temp>0)
		 {
			temp=temp/10; 
			count++;
		 }
        int a[] = new int[count];
        for (int i = 0; i < count; i++) {
            a[i] =num%10;
			num=num/10;
        }
        sc.nextLine();
        System.out.printf("Enter the String\n");
        String c=sc.nextLine();

        char ch[]=c.toCharArray();
        Reverse r=new Reverse(a);
        System.out.println();
        Reverse r1 =new Reverse(ch);
    }
}
