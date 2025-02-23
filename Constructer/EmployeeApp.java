//Q.5 WAP to Create a class name as Employee with a parameterised constructor and two function void CalSal( ) and void showDetails( ).

//Employee(int id,char name[ ],char contact[ ],int presentday,int perdaysal)
//{
// this constructor can store the all data in instance variable of class.
//}

//void CalSal( ) 
//{
//here need to write the logic for calculate the salary of employee as per his present days.
//}

//void showDetails()
//{
//here show the all details of employee.
//}

import java.util.*;
class Employee{
     int id;
	 char name[];
	 char contact[];
	 int presentday;
	 int perdaysal;
    Employee(int id,char name[],char contact[],int presentday,int perdaysal)
	{
		 this.id=id;
		 this.name=name;
		 this.contact=contact;
		 this.presentday=presentday;
		 this.perdaysal=perdaysal;
	}
	void calSalaray()
	{
		System.out.printf("\tTotal salary of employee is :%d",presentday*perdaysal);
		
	}
	void showDetails()
	{
		System.out.printf("%d\t",id);
		for(int i=0;i<name.length;i++)
        {
			System.out.print(name[i]); 
		}
        System.out.printf("\t");		
       	for(int i=0;i<contact.length;i++)
        {
			System.out.print(contact[i]); 
		}	
		System.out.printf("\t%d\t",presentday);
		System.out.printf("\t%d\t",perdaysal);
       			
	}
}
public class EmployeeApp{
   public static void main(String x[])
   {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name");
		String n=sc.nextLine();
		System.out.println("Enter the contact");
		long con=sc.nextLong();
		System.out.println("Enter the presentday");
		int pday=sc.nextInt();
		System.out.println("Enter the per day salaray");
		int sal=sc.nextInt();
    
        char name[]=n.toCharArray();
		
		String str=Long.toString(con);
        char contact[]=str.toCharArray();
		
        Employee emp = new Employee(id,name,contact,pday,sal);	
		emp.showDetails();	
        emp.calSalaray();
		   
   }
}
