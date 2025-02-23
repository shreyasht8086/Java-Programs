import java.util.Scanner;

abstract class Employee{
    abstract void displayInfo();
    abstract void calculateSalary();
}
class Manager extends Employee{
    float salary;
    int id ;
    String name;
    int age;
    void displayInfo()
    {   System.out.println("Employee id :"+id);
        System.out.println("Employee name :"+name);
        System.out.println("Employee age:"+age);
        System.out.println("Salary of manager is:"+salary);
    }
    void calculateSalary()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id of employee");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of employee");
        String name =sc.nextLine();
        System.out.println("Enter the age of employee");
        int age =sc.nextInt();
        System.out.println("Enter the basic pay of Manager");
        int basic= sc.nextInt();
        salary=basic+(basic*0.30f)+(basic*0.20f)-(basic*0.18f);

    }
}
class Programmer extends Employee{
    float salary;
    int id ;
    String name;
    int age;
    void displayInfo()
    {   System.out.println("Employee id :"+id);
        System.out.println("Employee name :"+name);
           System.out.println("Employee age:"+age);
        System.out.println("Salary of Programmer is:"+salary);
    }
    void calculateSalary()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id of employee");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of employee");
        String name =sc.nextLine();
        System.out.println("Enter the age of employee");
        int age =sc.nextInt();

        System.out.println("Enter the basic pay of Programer");
        int basic= sc.nextInt();
        salary=basic+(basic*0.20f)+(basic*0.10f)-(basic*0.12f);

    }

}
public class EmployeeApp{
    public static void main(String x[]){
        
        Employee e=new Manager();
        e.calculateSalary();
        e.displayInfo();

        e=new Programmer();
        e.calculateSalary();
        e.displayInfo();

    }
}